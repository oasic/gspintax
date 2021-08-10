# GSpintax
![](https://img.shields.io/github/issues/oasic/gspintax.svg)

*Groovy spintax parser for language generation*

This entire Groovy class can simply be copied into your existing project as an easy way to add spintax parsing or spinning to your application. While spinning has a negative connotation due to its usage in spam, it's very useful for quickly generating many permutations of text for projects involving language generation. 

## Example Usage

```
def spintax = 'I {like|love|hate|prefer not to eat} spaghetti and {meatballs|meat sauce|cheese|beer}'
println GSpintax.spin(spintax)
```

Example outputs:

```
I love spaghetti and cheese
I hate spaghetti and meatballs
I like spaghetti and meat sauce
I hate spaghetti and beer
I like spaghetti and meatballs
```

## Acknowledegments
* [Sentence Stack](https://sentencestack.com/)
* [Img Shields](https://shields.io)
* [Choose an Open Source License](https://choosealicense.com)
* [Groovy Lang](https://groovy-lang.org/) - IMHO, the most underrated programming language

## License
This code is released under the MIT License. See LICENSE.txt.


