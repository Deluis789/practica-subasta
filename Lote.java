public class Lote
{
    private int numeroDeLote;
    private String descripcion;
    private Oferta ofertaMaxima;
    
    public Lote (int numeroDeLote, String descripcion)
    {
        this.numeroDeLote = numeroDeLote;
        this.descripcion = descripcion;
    }

    public boolean ofertarPara(Oferta oferta){
        if ((ofertaMaxima ==null) || (oferta.getMonto() > ofertaMaxima.getMonto())){
        ofertaMaxima = oferta;
        return true;
        }
        else {
        return false;
        }
    }
    public Oferta getOfertaMaxima(){
        return ofertaMaxima;
    }
    public int getNumero(){
        return numeroDeLote;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public String toString ()
    {
        String cadena =numeroDeLote + ":" + descripcion;
        if(ofertaMaxima != null) cadena += "  Oferta max: " +      ofertaMaxima.getMonto();
        else cadena+="  (Sin oferta )";
        return cadena;
    }
    public String mostrarGanador()
    {
        String cadena = numeroDeLote + ": "+ descripcion;
        
        cadena += "Ganador : " + ofertaMaxima.getNombre();
        cadena += "Monto " + ofertaMaxima.getMonto();
        return cadena;
    }
}

