val list =(1 to 100).toList
list.map(fbMes).foreach(println)

def fbMes(i:Int):String={
  if(i%15==0){ 
    "FIZZBUZZ"  
  }else if(i%3==0){
    "BUZZ" 
  }else if(i%5==0){
    "FIZZ"
  }else{
    i.toString
  }
}