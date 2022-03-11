# Airport-GUI
A GUI for plotting routes between airports

<div align="center">
    <a href="https://github.com/irwin-deng/Airport-GUI"><img src="https://img.shields.io/tokei/lines/github/irwin-deng/Airport-GUI" /></a>
    <a href="https://github.com/irwin-deng/Airport-GUI"><img src="https://img.shields.io/github/languages/code-size/irwin-deng/Airport-GUI" /></a>
    <a href="https://github.com/irwin-deng/Airport-GUI/releases"><img src="https://img.shields.io/github/v/release/irwin-deng/Airport-GUI" /></a>
</div>

## How to use
Go to the [releases](https://github.com/irwin-deng/Airport-GUI/releases) page and download the latest .jar file

Double-click the executable .jar file. The following window should appear:
<div algin="center">
<img alt="app-interface" src="https://user-images.githubusercontent.com/85715371/157759913-78f453a1-642e-4f30-b2be-02c728a79b22.png" width="50%">
</div>

The window accepts the following inputs:
- __Airport 1__: The IATA code of the source airport. A list of all IATA codes can be found in [airports.csv](src/resources/airports.csv)
- __Airport 2__: The IATA code of the destination airport

Press the __Go!__ button to the right of each input to submit that input.

### Output
Once both inputs are submitted, the app will draw the shortest path between the two airports.
It will also display the coordinates of each airport and the distance between them in miles.

The following demo shows how to compute the route between New York City's JFK Airport and Perth's PER Airport.
<div algin="center">
<video src="https://user-images.githubusercontent.com/85715371/157771498-944f5203-a18e-46a4-b743-e780ec8ad4f3.mp4" width="50%">
</div>

## Building
* Clone this repo or download as a .zip file
* Open it in your preferred IDE (I used NetBeans) and build it with dependencies







