public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmarthTv smarthTv = new SmarthTv();

        smarthTv.diminuirVolume();
        smarthTv.diminuirVolume();
        smarthTv.diminuirVolume();
        smarthTv.diminuirVolume();
        
        smarthTv.mudarCanal(13);
        System.out.println("Canal Atual ? " + smarthTv.canal);

        System.out.println("Volume Atual: " +smarthTv.volume);

        System.out.println("Tv Ligada ? " + smarthTv.ligada);
        System.out.println("Canal Atual ? " + smarthTv.canal);
        System.out.println("Volume Atual ? " + smarthTv.volume);

        smarthTv.ligar();
         System.out.println("Novo status-> Tv Ligada ? " + smarthTv.ligada);

         smarthTv.desligar();
         System.out.println("Novo status-> Tv Ligada ? " + smarthTv.ligada);

        
    }
}
