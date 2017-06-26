int poo=400;
int moo=400;
int cool=200;
int pool=600;
void setup(){
size(800,400);  
  
  
  
  
}
void draw(){
  noFill();
  
poo-=5;
moo-=5;
  if( poo > 0){
    if(pool > 0){
    ellipse(cool,200,poo,moo);
    
    ellipse(pool,200,poo,moo);



    }
}
else{
background(690,58,68);
  poo=400;
  moo=400;
  pool-=25;
  cool+=25;
if (pool <=0){
 pool=25;
 
  
  
  
  
}


}

  
  
  
  
  
  
  
  
  
  
}