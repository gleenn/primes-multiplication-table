# primes multiplication table

Toy app to print a primes multiplication table

## How to run the code

Run `lein run` to print a multiplication table of the first 10 primes.

Optionally, you can run `lein run <N>` to print the table of the first N primes.

The prime-finding algorithm uses a very naive and un-cached technique. It works quickly enough for values of N up to about 1000.

## How to run the tests

The project uses [Midje](https://github.com/marick/Midje/).

`lein midje` will run all tests.
