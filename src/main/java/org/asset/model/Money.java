package org.asset.model;

public class Money {

    private Integer id;

    private Integer mid;

    private Integer sum;

    public Money() {
    }

    public Money(Integer id, Integer mid, Integer sum) {
        this.id = id;
        this.mid = mid;
        this.sum = sum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Money{" +
                "id=" + id +
                ", mid=" + mid +
                ", sum=" + sum +
                '}';
    }
}
