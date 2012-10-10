val list =(1 to 100).toList
list.map(fbMes).foreach(println)

def fbMes(i:Int):String={
  if(i%15==0){ 
    return "FIZZBUZZ"  
  }else if(i%3==0){
    return "BUZZ" 
  }else if(i%5==0){
    return "FIZZ"
  }else{
    return i.toString
  }
}