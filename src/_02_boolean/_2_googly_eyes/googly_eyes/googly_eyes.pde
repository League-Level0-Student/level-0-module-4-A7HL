PImage face;
void setup() {
face = loadImage("theZuck.jpg");
size (739,635);
face.resize(739,635);
}
//655 296
//403 283
  int x = 403;
  int y = 283;
void draw() {
  background (face);
  println(mouseX+" "+mouseY);
   fill(#1C1103);
  ellipse (403, 283, 50, 50);
  fill(#FFFFFF);
  ellipse (x, y, 4, 15);
  fill(#1C1103);
  ellipse (655, 296, 50, 50);
  fill(#FFFFFF);
  ellipse (x+252, y+13, 4, 15);
  if(mouseX>386&&mouseX<422&&mouseY>276 &&mouseY < 292){
   x = mouseX;
   y = mouseY;
  }
}
