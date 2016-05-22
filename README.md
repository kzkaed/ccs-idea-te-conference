# idea-te-recipe

A clojure (functional) example of a recipe

http://www.catherinecookschool.org/about/ideate

Educators for preschool through 12th grade can attend the IDEA:TE  (Innovation, Design, Engineering, and Art: Transforming Education) conference to learn to integrate traditional and emerging technologies into curriculum. Attendees can learn in workshops with some of the leading experts in fields like robotics, 3D printing, laser cutting and wearable technology.
Learn how to use tools and resources to incorporate emerging technology into every aspect of curriculum. The conference will feature dynamic presentations by educators with experience in bringing design, engineering and art into the classroom.

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

## Recipe

COD WITH GREEN OLIVES - CALABRIA

2 lbs. cod

2/3 cup extra virgin olive oil

2 garlic cloves, minced

2/3 cup pitted green olives, chopped

1 tbsp. chopped flat-leaf parsely

Salt

Clean and gut the cod and cut it in somewhat thick slices. *
In a pan, heat the olive oil and cook the garlic, then add the olives and cook for 10 minutes *
Add the fish, and when they are nearly cooked through, taste for salt and springle with parsely.
Serve immediately.

## Questions and Next Steps

What other data-structures could be used to represent this abstraction?

What further transformations could be made on ingredients?

How could transform-ingredients-to-dinner be refactored?

Can you write an algorithm that gives a result
that adjusts the recipe, given an amount of cod or other ingredients?

    Input : amount of cod
    Output : pretty print of recipe adjusted
