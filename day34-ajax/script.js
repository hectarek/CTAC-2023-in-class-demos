// fetchData("https://api.example.com/data1")
//   .then((data1) => {
    
//     console.log("Fetched data1:", data1);

//     let data2 = fetchData("https://api.example.com/data2");

//     return data2;
//   })
//   .then((data2) => {
//     console.log("Fetched data2:", data2);
//   })
//   .catch((error) => {
//     console.error("Error fetching data:", error);
//   });


//   fetchData("https://api.example.com/data1") // 100 ms // 1st
//   fetchData("https://api.example.com/data2") // 300 ms // 4th
//   fetchData("https://api.example.com/data3") // 500 ms // 6th
//   fetchData("https://api.example.com/data4") // 400 ms // 5th
//   fetchData("https://api.example.com/data5") // 200 ms // 3rd
//   fetchData("https://api.example.com/data6") // 105 ms // 2nd



// let myPromise = new Promise((reject, resolve) => {

// })


// Async / Await

// let goGetData = async () => {
   
//     let rawData = await fetch('https://jsonplaceholder.typicode.com/posts');
//     let jsonData = await rawData.json();

//     console.log(jsonData);

//     return jsonData
// }

// goGetData();

// let getMeme = async () => {
   
//     let rawData = await fetch('https://api.imgflip.com/get_memes');
//     let jsonData = await rawData.json();
//     let meme = jsonData.data.memes[0].url;

//     console.log(meme);

//     return jsonData
// }

// getMeme();

fetch('https://jsonplaceholder.typicode.com/posts/1')
.then(response => response.json())
.then(result => console.log(result))
.catch()

// console.log(Promise);

async function getData () {

    try {
        let data = await fetch('someurl')

    } catch (error) {

        console.log(error);

    }

}