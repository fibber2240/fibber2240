public class AnnoInner {
    interface SaleToDayOnly {
        int dollarsOff();
    }
    public int pay(){
        return admission(5, new SaleToDayOnly(){
            public int dollarsOff(){
                return 3;
            }
        });
    }
    public int admission(int basePrice, SaleToDayOnly sale){
        return basePrice - sale.dollarsOff();
    }
}
