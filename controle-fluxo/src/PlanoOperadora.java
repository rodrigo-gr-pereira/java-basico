public class PlanoOperadora {
    
    public static void main(String[] args) {
        /*
         O sistema terá 03 planos: BASIC, MIDIA , TURBO;

        BASIC: 100 minutos de ligação;

        MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;

        TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube. 
         

         String plano = "M"; //M / T
		
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}
    }
        */
        String plano = "M"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
    }
}
