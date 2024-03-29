package de.alpharogroup.basentcore.jpa.entity;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * The entity class {@link Countries} is keeping the information for all countries in the world
 */
@Entity @Table(name = Countries.TABLE_NAME)
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Getter @Setter
@NoArgsConstructor
@SequenceGenerator(name =
	BaseSequenceEntity.GENERIC_GENERATOR_NAME, sequenceName =
	"seq_"
		+ Countries.TABLE_NAME, allocationSize = 1)
public class Countries
	extends UniqueNameEntity<Integer> implements Cloneable
{

	public static final String TABLE_NAME = "countries";
	/** The serial Version UID. */
	private static final long serialVersionUID = 1L;
	/** The iso3166 name with two characters. */
	@Column(name = "iso3166_a2name", length = 2) private String iso3166A2name;

	/**
	 * Instantiates a new countries.
	 *
	 * @param name
	 *            the name
	 * @param iso3166a2name
	 *            the iso 3166 a 2 name
	 */
	@Builder public Countries(String name, String iso3166a2name)
	{
		super(name);
		iso3166A2name = iso3166a2name;
	}

}