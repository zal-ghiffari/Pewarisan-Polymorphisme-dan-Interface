public class Human extends LivingThing{
    public void walk() {
		//System.out.println("Human walks...");
    }
    
    public static void main(String args[]) {
        LivingThing livthing = new LivingThing(){
        
            @Override
            public void walk() {
                // TODO Auto-generated method stub
                System.out.println("Human walks...");
            }
        };

        livthing.breath();
        livthing.eat();
        livthing.walk();
    }
}