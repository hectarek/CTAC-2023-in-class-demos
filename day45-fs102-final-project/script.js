const baseCurrencySelect = document.getElementById("base-currency");
const targetCurrencySelect = document.getElementById("target-currency");
const amountInput = document.getElementById("amount");
const convertedAmountDisplay = document.getElementById("converted-amount");
const historicalRatesButton = document.getElementById("historical-rates");
const historicalRatesContainer = document.getElementById("historical-rates-container");
const saveFavoriteButton = document.getElementById("save-favorite");
const favoriteCurrencyPairs = document.getElementById("favorite-currency-pairs");

const API_URL = "https://api.apilayer.com/exchangerates_data/v1/";

const myHeaders = new Headers();
myHeaders.append("apikey", "My API Key");

const requestOptions = {
	method: "GET",
	redirect: "follow",
	headers: myHeaders,
};

async function fetchCurrencies() {
	const response = await fetch(`${API_URL}/symbols`, requestOptions);
	const data = await response.json();
	console.log(data);
	// const currencyCodes = Object.keys(data.symbols);
	// console.log(currencyCodes);
	// currencyCodes.unshift(data.base);
	// const filteredList = currencyCodes.filter((currency) => currency !== data.base);
    const mostCommonCurrencies = ["EUR", "USD", "GBP", "JPY", "CAD", "AUD", "CHF", "SEK", "NOK", "BRL"];

	return mostCommonCurrencies;
}

async function fetchExchangeRate(baseCurrency, targetCurrency, amount) {
	const response = await fetch(`${API_URL}/convert?from=${baseCurrency}&to=${targetCurrency}&amount=${amount}`, requestOptions);
	const data = await response.json();
	return data.result;
}

function populateCurrencyOptions(currencies) {
	currencies.forEach((currency) => {
		const option = document.createElement("option");
		option.value = currency;
		option.textContent = currency;

		baseCurrencySelect.appendChild(option.cloneNode(true));
		targetCurrencySelect.appendChild(option);
	});
}

async function updateConvertedAmount() {
	const baseCurrency = baseCurrencySelect.value;
	const targetCurrency = targetCurrencySelect.value;
	const amount = parseFloat(amountInput.value);

	if (isNaN(amount)) {
		convertedAmountDisplay.textContent = "Please enter a valid amount";
		return;
	}

	const exchangeRates = await fetchExchangeRate(baseCurrency, targetCurrency, amount);
	// const exchangeRate = exchangeRates[targetCurrency];
	const convertedAmount = exchangeRates.toFixed(2);

	convertedAmountDisplay.textContent = `${convertedAmount} ${targetCurrency}`;
}

async function displayHistoricalRates() {
	const baseCurrency = baseCurrencySelect.value;
	const targetCurrency = targetCurrencySelect.value;
	const historicalDate = "2021-01-01";
	const response = await fetch(`${API_URL}/${historicalDate}?base=${baseCurrency}&symbols=${targetCurrency}`, requestOptions);
	const data = await response.json();
	const historicalRate = data.rates[targetCurrency];

	historicalRatesContainer.textContent = `Historical exchange rate on ${historicalDate}: 1 ${baseCurrency} = ${historicalRate} ${targetCurrency}`;
}

function saveFavoriteCurrencyPair() {
	const baseCurrency = baseCurrencySelect.value;
	const targetCurrency = targetCurrencySelect.value;
    const favoritePairListItem = document.createElement("div");
    const favoritePairButton = document.createElement("button");
    favoritePairButton.classList.add("favorite-pair");
    favoritePairButton.textContent = `${baseCurrency} / ${targetCurrency}`;
    favoritePairButton.addEventListener("click", () => {
        baseCurrencySelect.value = baseCurrency;
        targetCurrencySelect.value = targetCurrency;
        updateConvertedAmount();
    });
    favoritePairListItem.appendChild(favoritePairButton);
    favoriteCurrencyPairs.appendChild(favoritePairListItem);
}

(async function initialize() {
	const currencies = await fetchCurrencies();
	populateCurrencyOptions(currencies);
	updateConvertedAmount();

	baseCurrencySelect.addEventListener("change", updateConvertedAmount);
	targetCurrencySelect.addEventListener("change", updateConvertedAmount);
	amountInput.addEventListener("input", updateConvertedAmount);
	historicalRatesButton.addEventListener("click", displayHistoricalRates);
	saveFavoriteButton.addEventListener("click", saveFavoriteCurrencyPair);
})();
