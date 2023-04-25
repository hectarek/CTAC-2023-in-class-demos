// ES6 way
// import moment from "moment";

// // // Node way
// // const moment = require('moment');

// const myMoment = new moment();

// console.log(myMoment.format('h:mm:ss a'));

// console.log(myMoment.format());


// Import Fruits otherwise is doesn't work. 

// import { fruits, trees } from './script2.js'

// console.log(fruits);

// console.log(trees);


// jQuery

// const header2 = document.querySelector('#header');
// const header = $('#header')

// console.log(header);

// const divs = $('div')

// console.log(divs);

let i = 1;


$('#list-btn').on('click', (event) => {

    const newLI = `<li>List Item ${i}</li>`

    $('#my-list').append(newLI)

    i++;

})

$('#square-btn').on("click", () => {
    let redSquare = $('#red-square');

    if(redSquare.attr('class') === 'hidden') {
        redSquare.removeClass('hidden');
    } else {
        redSquare.addClass('hidden');
    }
})
