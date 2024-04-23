package D09_ClasslarIleCalismak;

public class E01_ClassNedir {
    public static void main(String[] args) {
        //Nesne yonelimli programlama önemli
        //E02_CustomerManager class i ile calismak
        //Class lar "reference type" dir

        E02_CustomerManager customerManager;
        
        /* E02_CustomerManager customerManager = new E01_CustomerManager();
        ==> burası anlamsız olmus oldu. burayı heap memory de tutan herhangi birşey kalmadıgı icin
        Grabage collector -> çöp toplayıcı bunu heap memory den siler.
        bir nesneyi new lemek pahalıdır. yer kaplar.
        */
        E02_CustomerManager customerManager2 = new E02_CustomerManager();

        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
    }
}

