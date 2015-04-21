package br.udc.engenharia.agenda.domain.entity.compromisso;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.directwebremoting.annotations.DataTransferObject;

import br.udc.engenharia.agenda.domain.entity.AbstractEntity;
import br.udc.engenharia.agenda.domain.entity.account.User;

/**
 * @author Henrique L. Zago
 * @since 07/04/2015
 *
 */
@Entity
@DataTransferObject(javascript = "TipoCompromisso")
public class TipoCompromisso extends AbstractEntity implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2049158151247085078L;

	/**
	 * 
	 */
	@NotNull
	@Column
	private String descricao;
	
	
	/**
	 * 
	 */
	@ManyToOne
	private User usuario;

	/**
	 * 
	 */
	public TipoCompromisso()
	{
		super();
	}
	
	/**
	 * @param descricao
	 * @param usuario
	 */
	public TipoCompromisso( Long id, String descricao, User usuario )
	{
		super(id);
		this.descricao = descricao;
		this.usuario = usuario;
	}
	
	/**
	 * @param descricao
	 * @param usuario
	 */
	public TipoCompromisso( String descricao, User usuario )
	{
		super();
		this.descricao = descricao;
		this.usuario = usuario;
	}


	/**
	 * @return the descricao
	 */
	public String getDescricao()
	{
		return descricao;
	}


	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao( String descricao )
	{
		this.descricao = descricao;
	}


	/**
	 * @return the usuario
	 */
	public User getUsuario()
	{
		return usuario;
	}


	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario( User usuario )
	{
		this.usuario = usuario;
	}


	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}
	
	
}