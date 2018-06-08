package cn.com.git.gfets.entity;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
@Entity
@Table(name = "T_TRANS_NOTICE")
public class TransNotice extends cn.com.git.base.das.entity.PurePO<String> implements java.io.Serializable{
	private static final long serialVersionUID = 9207423255476733182L;

	@Id
    @Column(name = "ID")
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "cn.com.git.gfets.util.hibernate.AutoIdentifierGenerator",parameters = { @Parameter(name = "sequence", value = "id_sequence") })
    private String id;

	
	@Column(name = "CL_ORD_ID")
	private String clOrdID;
	/**
	 * 成交编号
	 */
	@Column(name = "EXEC_ID")
	private String execId;

	/**
	 * 订单编号
	 */
	@Column(name = "ORDER_ID")
	private String orderId;
	/**
	 * 报价编号
	 */
	@Column(name = "QUOTE_ID")
	private String quoteId;
	/**
	 * 请求报价编号
	 */
	@Column(name = "REFERENCE")
	private String reference;
	/**
	 * 市场编号
	 */
	@Column(name = "MARKET_INDICATOR")
	private String marketIndicator;
	/**
	 * 债券代码
	 */
	@Column(name = "SECURITY_ID")
	private String securityId;
	/**
	 * 债券名称
	 */
	@Column(name = "SYMBOL")
	private String symbol;
	/**
	 * 交易方向
	 */
	@Column(name = "SIDE")
	private String side;
	/**
	 * 交易类型
	 */
	@Column(name = "TRADE_METHOD")
	private String tradeMethod;
	/**
	 * 券面总额
	 */
	@Column(name = "LASTQTY")
	private BigDecimal lastqty;
	/**
	 * 净价
	 */
	@Column(name = "PRICE")
	private BigDecimal price;
	/**
	 * 全价
	 */
	@Column(name = "DIRTY_PRICE")
	private BigDecimal dirtyPrice;
	/**
	 * 应计利息
	 */
	@Column(name = "INTEREST_AMT")
	private BigDecimal interestAmt;
	/**
	 * 应计利息总额
	 */
	@Column(name = "INTERREST_TOTAL_AMT")
	private BigDecimal interrestTotalAmt;
	/**
	 * 业务发生时间
	 */
	@Column(name = "TRANS_TIME")
	private String transTime;
	/**
	 * 交易金额
	 */
	@Column(name = "TRADE_CASH_AMT")
	private BigDecimal tradeCashAmt;
	/**
	 * 结算日期
	 */
	@Column(name = "SETTL_DATE")
	private String settlDate;
	/**
	 * 结算金额
	 */
	@Column(name = "SETTL_CURR_AMT")
	private BigDecimal settlCurrAmt;
	/**
	 * 结算方式
	 */
	@Column(name = "DELIVERY_TYPE")
	private String deliveryType;
	/**
	 * 清算方式
	 */
	@Column(name = "CLEAR_METHOD")
	private String clearMethod;
	/**
	 * 应急标识
	 */
	@Column(name = "CONTINGENCY_INDICATOR")
	private String contingencyIndicator;
	/**
	 * 待偿期
	 */
	@Column(name = "TERM_TO_MATURITY")
	private String termToMaturity;
	/**
	 * 成交日期
	 */
	@Column(name = "TRADE_DATE")
	private String tradeDate;
	/**
	 * 成交时间
	 */
	@Column(name = "TRADE_TIME")
	private String tradeTime;
	/**
	 * 成交类别
	 */
	@Column(name = "TRADE_TYPE")
	private String tradeType;
	/**
	 * 成交传输动作状态
	 */
	@Column(name = "DEAL_TRANS_TYPE")
	private String dealTransType;
	/**
	 * 数据类型标识
	 */
	@Column(name = "DATA_INDICATOR")
	private String dataIndicator;
	/**
	 * 收益率类型
	 */
	@Column(name = "STIPULATION_TYPE")
	private String stipulationType;
	/**
	 * 收益率的值
	 */
	@Column(name = "STIPULATION_VALUE")
	private BigDecimal stipulationValue;
	/**
	 * 备注
	 */
	@Column(name = "TEXT")
	private String text;
	/**
	 * 成交状态
	 */
	@Column(name = "EXEC_TYPE")
	private String execType;
	/**
	 * 创建时间
	 */
	@Column(name = "CREATE_TS")
	private Timestamp createtTs;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClOrdID() {
		return clOrdID;
	}
	public void setClOrdID(String clOrdID) {
		this.clOrdID = clOrdID;
	}
	public String getExecId() {
		return execId;
	}
	public void setExecId(String execId) {
		this.execId = execId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getMarketIndicator() {
		return marketIndicator;
	}
	public void setMarketIndicator(String marketIndicator) {
		this.marketIndicator = marketIndicator;
	}
	public String getSecurityId() {
		return securityId;
	}
	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getSide() {
		return side;
	}
	public void setSide(String side) {
		this.side = side;
	}
	public String getTradeMethod() {
		return tradeMethod;
	}
	public void setTradeMethod(String tradeMethod) {
		this.tradeMethod = tradeMethod;
	}
	public BigDecimal getLastqty() {
		return lastqty;
	}
	public void setLastqty(BigDecimal lastqty) {
		this.lastqty = lastqty;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getDirtyPrice() {
		return dirtyPrice;
	}
	public void setDirtyPrice(BigDecimal dirtyPrice) {
		this.dirtyPrice = dirtyPrice;
	}
	public BigDecimal getInterestAmt() {
		return interestAmt;
	}
	public void setInterestAmt(BigDecimal interestAmt) {
		this.interestAmt = interestAmt;
	}
	public BigDecimal getInterrestTotalAmt() {
		return interrestTotalAmt;
	}
	public void setInterrestTotalAmt(BigDecimal interrestTotalAmt) {
		this.interrestTotalAmt = interrestTotalAmt;
	}
	public String getTransTime() {
		return transTime;
	}
	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}
	public BigDecimal getTradeCashAmt() {
		return tradeCashAmt;
	}
	public void setTradeCashAmt(BigDecimal tradeCashAmt) {
		this.tradeCashAmt = tradeCashAmt;
	}
	public String getSettlDate() {
		return settlDate;
	}
	public void setSettlDate(String settlDate) {
		this.settlDate = settlDate;
	}
	public BigDecimal getSettlCurrAmt() {
		return settlCurrAmt;
	}
	public void setSettlCurrAmt(BigDecimal settlCurrAmt) {
		this.settlCurrAmt = settlCurrAmt;
	}
	public String getDeliveryType() {
		return deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}
	public String getClearMethod() {
		return clearMethod;
	}
	public void setClearMethod(String clearMethod) {
		this.clearMethod = clearMethod;
	}
	public String getContingencyIndicator() {
		return contingencyIndicator;
	}
	public void setContingencyIndicator(String contingencyIndicator) {
		this.contingencyIndicator = contingencyIndicator;
	}
	public String getTermToMaturity() {
		return termToMaturity;
	}
	public void setTermToMaturity(String termToMaturity) {
		this.termToMaturity = termToMaturity;
	}
	public String getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}
	public String getTradeTime() {
		return tradeTime;
	}
	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}
	public String getTradeType() {
		return tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	public String getDealTransType() {
		return dealTransType;
	}
	public void setDealTransType(String dealTransType) {
		this.dealTransType = dealTransType;
	}
	public String getDataIndicator() {
		return dataIndicator;
	}
	public void setDataIndicator(String dataIndicator) {
		this.dataIndicator = dataIndicator;
	}
	public String getStipulationType() {
		return stipulationType;
	}
	public void setStipulationType(String stipulationType) {
		this.stipulationType = stipulationType;
	}
	public BigDecimal getStipulationValue() {
		return stipulationValue;
	}
	public void setStipulationValue(BigDecimal stipulationValue) {
		this.stipulationValue = stipulationValue;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getExecType() {
		return execType;
	}
	public void setExecType(String execType) {
		this.execType = execType;
	}
	public Timestamp getCreatetTs() {
		return createtTs;
	}
	public void setCreatetTs(Timestamp createtTs) {
		this.createtTs = createtTs;
	}
	
	
	//@OneToMany(cascade=CascadeType.ALL, mappedBy="transNotice")
	//private List<AccountInfo> listAccountInfo= new ArrayList<AccountInfo>();

	
}
