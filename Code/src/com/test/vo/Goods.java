package com.test.vo;

public class Goods {

	String GoodName;//��Ʒ����
	Float GoodPrice;//��Ʒ�۸�
	String GoodDescribe;//��Ʒ������
	/*�ö���������ͼƬ�洢�������ݿ⣬��Ϊ��֪��ͼƬ�Ĵ�С�����Զ���һ��length��
	 * ���峤�ȡ��ڶ�ȡ�ļ�ʱ����ͼƬת���ɶ����ƺ�ĳ��ȸ�ֵ��length*/
	int Length;
	byte[] GoodImage = new byte[Length];//��Ʒ��ͼƬ
	
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Goods(int length, String goodName, Float goodPrice, String goodDescribe, byte[] goodImage) {
		super();
		Length = length;
		GoodName = goodName;
		GoodPrice = goodPrice;
		GoodDescribe = goodDescribe;
		GoodImage = goodImage;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public String getGoodName() {
		return GoodName;
	}

	public void setGoodName(String goodName) {
		GoodName = goodName;
	}

	public Float getGoodPrice() {
		return GoodPrice;
	}

	public void setGoodPrice(Float goodPrice) {
		GoodPrice = goodPrice;
	}

	public String getGoodDescribe() {
		return GoodDescribe;
	}

	public void setGoodDescribe(String goodDescribe) {
		GoodDescribe = goodDescribe;
	}

	public byte[] getGoodImage() {
		return GoodImage;
	}

	public void setGoodImage(byte[] goodImage) {
		GoodImage = goodImage;
	}
	
	
	
}
