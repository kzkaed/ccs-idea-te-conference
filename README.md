# idea-te-recipe

A clojure (functional) example of a recipe

## Usage

IDEA-TE Conference
Making the leap from recipe to functional programming

INPUT [transformation] OUTPUT

breaking it down into smaller functions

    ingredients [transformation] dinner

## Set Up

Install [Leiningen 2](https://github.com/technomancy/leiningen) if you already haven't. Make sure you have the lein command available in your terminal with `which lein`. Then download the source code with [Git](http://git-scm.com/downloads) by cloning the repository. Now cd into the idea-te-recipe directory.

## Run

`lein run`

prints out the data structure

## Testing

To run all (Clojure) tests use `lein spec`. To run them automatically for development, use `lein spec -a` (after running all tests once, this will block and rerun the relevant ones as the code is being modified).
