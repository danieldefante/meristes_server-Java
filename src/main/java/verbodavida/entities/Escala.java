package verbodavida.entities;
// Generated Aug 17, 2017 7:14:29 PM by Hibernate Tools 4.3.1


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Escala generated by hbm2java
 */
@Entity
@Table(name="escala"
    ,schema="public"
)
public class Escala  implements java.io.Serializable {


     private long idescala;
     private VinculoPessoaGrupo vinculoPessoaGrupo;
     private Date dataInicial;
     private Date dataFinal;

    public Escala() {
    }

	
    public Escala(long idescala, VinculoPessoaGrupo vinculoPessoaGrupo) {
        this.idescala = idescala;
        this.vinculoPessoaGrupo = vinculoPessoaGrupo;
    }
    public Escala(long idescala, VinculoPessoaGrupo vinculoPessoaGrupo, Date dataInicial, Date dataFinal) {
       this.idescala = idescala;
       this.vinculoPessoaGrupo = vinculoPessoaGrupo;
       this.dataInicial = dataInicial;
       this.dataFinal = dataFinal;
    }
   
     @Id 

     @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idescala", unique=true, nullable=false)
    public long getIdescala() {
        return this.idescala;
    }
    
    public void setIdescala(long idescala) {
        this.idescala = idescala;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="vinculo_pessoa_grupo_idvinculo_pessoa_grupo", nullable=false)
    public VinculoPessoaGrupo getVinculoPessoaGrupo() {
        return this.vinculoPessoaGrupo;
    }
    
    public void setVinculoPessoaGrupo(VinculoPessoaGrupo vinculoPessoaGrupo) {
        this.vinculoPessoaGrupo = vinculoPessoaGrupo;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="data_inicial", length=29)
    public Date getDataInicial() {
        return this.dataInicial;
    }
    
    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="data_final", length=29)
    public Date getDataFinal() {
        return this.dataFinal;
    }
    
    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }




}


