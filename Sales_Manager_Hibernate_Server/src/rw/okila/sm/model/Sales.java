package rw.okila.sm.model;
// Generated Jun 2, 2022 1:14:30 PM by Hibernate Tools 4.3.1



/**
 * Sales generated by hbm2java
 */
public class Sales  implements java.io.Serializable {


     private String salesid;
     private String SCustoname;
     private String SProdtin;
     private String SCustphone;
     private String SProdname;
     private String salesquantity;
     private String SUnitprice;

    public Sales() {
    }

	
    public Sales(String salesid) {
        this.salesid = salesid;
    }
    public Sales(String salesid, String SCustoname, String SProdtin, String SCustphone, String SProdname, String salesquantity, String SUnitprice) {
       this.salesid = salesid;
       this.SCustoname = SCustoname;
       this.SProdtin = SProdtin;
       this.SCustphone = SCustphone;
       this.SProdname = SProdname;
       this.salesquantity = salesquantity;
       this.SUnitprice = SUnitprice;
    }
   
    public String getSalesid() {
        return this.salesid;
    }
    
    public void setSalesid(String salesid) {
        this.salesid = salesid;
    }
    public String getSCustoname() {
        return this.SCustoname;
    }
    
    public void setSCustoname(String SCustoname) {
        this.SCustoname = SCustoname;
    }
    public String getSProdtin() {
        return this.SProdtin;
    }
    
    public void setSProdtin(String SProdtin) {
        this.SProdtin = SProdtin;
    }
    public String getSCustphone() {
        return this.SCustphone;
    }
    
    public void setSCustphone(String SCustphone) {
        this.SCustphone = SCustphone;
    }
    public String getSProdname() {
        return this.SProdname;
    }
    
    public void setSProdname(String SProdname) {
        this.SProdname = SProdname;
    }
    public String getSalesquantity() {
        return this.salesquantity;
    }
    
    public void setSalesquantity(String salesquantity) {
        this.salesquantity = salesquantity;
    }
    public String getSUnitprice() {
        return this.SUnitprice;
    }
    
    public void setSUnitprice(String SUnitprice) {
        this.SUnitprice = SUnitprice;
    }




}


