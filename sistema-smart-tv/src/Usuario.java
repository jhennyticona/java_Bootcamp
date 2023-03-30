public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("Canal: "+smartTv.canal);
        System.out.println("Volume: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada: "+smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV ligada: "+smartTv.ligada);

        smartTv.aumentarVolume();
        System.err.println("Aumentando o volumen para: "+smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Diminuindo o volumen para: "+smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal mudado para: "+smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Canal mudado para: "+smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal mudado para: "+smartTv.canal);
    }
}
