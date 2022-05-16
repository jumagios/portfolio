// module("About Asserts (topics/about_asserts.js)");
//const { ok, equal } = require('assert')
const assert = require('assert')
const { ok, equal } = assert
// const { __, test } = require('../support/koans')
const koans = require('../support/koans')
// const __ = koans.__
// const test = koans.test
const { __ } = koans
const { test } = koans


koans.test("ok", () => {
    assert.ok(true === true, 'what will satisfy the ok assertion?');
})

test("not ok", () => {
    assert.ok( false === false, 'what is a false value?');
})

test("ok", () => {
    assert.equal(2, 1 + 1, 'what will satisfy the equal assertion?');
})