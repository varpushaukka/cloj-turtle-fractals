# clojturtle

clojure-turtle fractals


## tree

![tree-fractal](tree.png)

## c-curve

![cline-fractal](cline.png)

## sierpinski
![sierpinski-fractal](sierp.png)

## koch
![koch-curve](koch.png)

## tiles
![tiles](tile.png)

## rings
![rings](rings.png)

## terdragon
![terdragon-curve](terdragon.png)

## pentaplex
![pentaplex](pentaplex.png)

## dragon curve
![dragon-curve](dragon.png)


## Usage

`lein repl`
`(new-window {:size [920 900]})`

### tree
`(setxy 100 -200)`

`(tree/tree [0 100 100] 5 200 true)`

### Lévy C curve
`(setxy -100 -200)`

`(cline 8 300)`

### Sierpiński
`(setxy -400 -400)`

`(sierpi 15 800)`

### Koch curve (regular and quadratic type)
`(clean) (setxy -200 -400) (koch 20 800) (setxy 0 -400) (squarekoch 4 10)`

### Tiles
`(repeat 4 (all (tile 4 10) (right 90)))`

### Rings
`(new-window {:size [1700 900]}) (setxy -835 100) (rings 5 5)`

### Terdragon
`(setxy -635 0) (clean) (terdragon 9 8 [150 -100 110])`

### Pentaplex
`(repeat 5 (all (pentaplex 4 10) (right 36) (right 36)))`

### Dragon curve
` (setxy -435 -250) (clean) (right 180) (dragon 13 4)`

## License


<p xmlns:dct="http://purl.org/dc/terms/" xmlns:vcard="http://www.w3.org/2001/vcard-rdf/3.0#">
  <a rel="license"
     href="http://creativecommons.org/publicdomain/zero/1.0/">
    <img src="http://i.creativecommons.org/p/zero/1.0/88x31.png" style="border-style: none;" alt="CC0" />
  </a>
  <br />
  To the extent possible under law,
  <span resource="[_:publisher]" rel="dct:publisher">
    <span property="dct:title">Henna Kalliokoski</span></span>
  has waived all copyright and related or neighboring rights to
  this work.
This work is published from:
<span property="vcard:Country" datatype="dct:ISO3166"
      content="FI" about="[_:publisher]">
  Finland</span>.
</p>