object book extends App{
  def price(x:Int):Double=if(x>50) x*24.95*60/100 + 50*3 + (x-50)*0.75
                          else x*24.95*60/100 + x*3;

  println(price(60));
}
