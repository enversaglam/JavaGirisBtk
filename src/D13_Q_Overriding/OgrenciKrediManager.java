package D13_Q_Overriding;

public class OgrenciKrediManager extends BaseKrediManager{
    public double hesapla(double tutar){
        return tutar * 1.10;
    }
}
