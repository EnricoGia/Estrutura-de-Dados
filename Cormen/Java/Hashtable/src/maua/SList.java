package maua;

public class SList {
    Integer value;
    SList proximo;

    public SList() {
        this.value = 0;
        this.proximo = null;
    }

    public SList(Integer key) {
        this.value = key;
        this.proximo = null;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public SList getProximo() {
        return proximo;
    }

    public void setProximo(SList proximo) {
        this.proximo = proximo;
    }


    public void InsereInicio(Integer endereco, SList[] vetor) {

        if (vetor[endereco] == null)
            vetor[endereco] = this;

        else {
            this.proximo = vetor[endereco];
            vetor[endereco] = this;
        }

    }

}