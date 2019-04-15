PImage moustache;
  PImage annoyingOrange;

void setup(){
  annoyingOrange = loadImage("annoying orange.jpg");
  size(1000,1000);
  annoyingOrange.resize(1000,1000);
  moustache = loadImage("moustache.png");
 
}

void draw(){
  background(annoyingOrange);
  if(mousePressed){
      image(moustache,mouseX,mouseY);
}
}