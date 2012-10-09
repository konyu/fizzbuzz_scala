val list=(1 to 100).toList
list.foreach(printFB)

def printFB(i:Int){
  if(i%15==0) 
    println("FIZZBUZZ")  
  else if(i%3==0)
    println("BUZZ") 
  else if(i%5==0)
    println("FIZZ") 
  else
    println(i)
}