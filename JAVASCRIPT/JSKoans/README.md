Update
======

JavaScript Koans is an interactive learning environment that uses failing tests to introduce students to aspects of JavaScript in a logical sequence. 

The inspiration for this project comes from the Edgecase Ruby Koans and the book 'Javascript: The Good Parts'.

The goal is to make the tests pass, and for that you need to "fill in the gaps".

While the original project is made to run in a browser, this is an adaptation to be run under [NodeJS](https://nodejs.org/).

The koans use the internal NodeJS' `assert` module and implement a minimum colored interface to display the results.

Some tasks that are intended to be part of the excercise:
1. Create a package.json to describe the project
1. Add an npm script –in package.json– to make the tests run in the expected sequence (see jskoans.html)
1. Modify the scripts to allow them to be imported as modules into this npm script
1. Add a dependency (like `chalk`) to improve the coloring in the terminal

Pending stuff to be added as tests:
* Object and array destructuring

Get started with Ryan Anklam's [Learn JavaScript completely On the Cloud With the JavaScript Koans and Cloud9 IDE](http://blog.bittersweetryan.com/2011/08/learn-some-javascript-completely-on.html)
