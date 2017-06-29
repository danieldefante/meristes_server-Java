package verbodavida.entities;
// Generated Jun 26, 2017 9:14:43 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Grupo generated by hbm2java
 */
@Entity
@Table(name="grupo"
    ,schema="public"
)
public class Grupo  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private int idgrupo;
    
	private Ministerio ministerio;
    
    private String nome;

    private String descricao;

    public Grupo() {
    }

	
    public Grupo(int idgrupo, Ministerio ministerio) {
        this.idgrupo = idgrupo;
        this.ministerio = ministerio;
    }
    public Grupo(int idgrupo, Ministerio ministerio, String nome, String descricao) {
       this.idgrupo = idgrupo;
       this.ministerio = ministerio;
       this.nome = nome;
       this.descricao = descricao;
    }
   
     @Id 

    
    @Column(name="idgrupo", unique=true, nullable=false)
    public int getIdgrupo() {
        return this.idgrupo;
    }
    
    public void setIdgrupo(int idgrupo) {
        this.idgrupo = idgrupo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ministerio_idministerio", nullable=false)
    public Ministerio getMinisterio() {
        return this.ministerio;
    }
    
    public void setMinisterio(Ministerio ministerio) {
        this.ministerio = ministerio;
    }

    
    @Column(name="nome", length=50)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="descricao")
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }




}


