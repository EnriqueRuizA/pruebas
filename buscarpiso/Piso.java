// PROGRAMA PARA ELEGIR PISO COMPARTIDO
package buscarpiso;

//CLASS USER WITH PRIVATE VARIABLES
public class Piso {
	private float price;
    private float distanceToSol;
    private int movilPhone;
    private String infoPage;

//  //CLASS CONSTRUCTOR

    Piso(){}

    Piso(float pvp, int phone){
		this.price = pvp;
		this.movilPhone = phone;}

	Piso(float pvp,float dist, int phone,
			String url){
		this.price = pvp;
		this.distanceToSol = dist;
		this.movilPhone = phone;
		this.infoPage = url;}
/*
  	//PUBLIC MUTATORS

	public void setPrice(int price)
		{this.price = price;}
	public void setDistanceToSol(int distanceToSol)
		{this.distanceToSol = distanceToSol;}
*/

//  PUBLIC ACCESSORS
    public float getPrice()
    	{return price;}
    public float getDistanceToSol()
    	{return distanceToSol;}
	public int getMovilPhone()
		{return movilPhone;}
	public String getInfoPage()
		{return infoPage;}

//	PUBLIC METHOD
	Piso mejorPiso = new Piso ();
	for (Piso piso:pisos){
		if (piso.getPrice<minPrice) {
			minPrice = piso.getPrice;
			mejorPiso = piso;
		}
	}
	return mejorPiso;
}
