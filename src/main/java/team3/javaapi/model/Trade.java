package team3.javaapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

import java.util.Date;


@Entity
@Table(name = "Trade")
@Data
public class Trade {
	
	@Id
	private long id;

    private long bid;

    @Column(name="cpid")
    private long cpid;
    
    
    @Column(name="sid")
    private long sid;
    
    @Column(name="quantity")
    private int quantity;
    
    @Column(name="status")
    private boolean status;
    
    @Column(name="price")
    private double price;
    
    @Column(name="buy_sell")
    private double buy_sell;
    
    @Column(name="TradeDate")
    private Date TradeDate;
    
    @Column(name="SettlementDate")
    private Date SettlementDate;

   
    
	
}
