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


## License

Copyright © 2019 Henna Kalliokoski

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
