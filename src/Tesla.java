class Tesla implements Vehicle,AI{
    //Non-abstract method
    public void title(){
        System.out.println("--- TESLA CAR DETAILS ---");
    }
    //Implementation of abstract methods of Vehicle interface
    @Override
    public void parts(){
        System.out.println("Parts : 2 Wheels");
    }
    @Override
    public void move(){
        System.out.println("Feature : Moves swiftly on two wheels");
    }
    //Implementation of abstract methods of AI interface
    @Override
    public void AItools() {
        System.out.println("Special Feature : AI enabled car - Completely Driverless");
    }
}