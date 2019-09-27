package de.alpharogroup.basentcore.jpa.entity;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

/**
 * The class {@link UniqueNameEntity} is a base entity for a table with a single unique value and
 * versionable
 *
 * @param <PK>
 *            the generic type of the id
 */
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@AttributeOverride(name = "name", column = @Column(name = "name", unique = true, columnDefinition = "TEXT"))
public abstract class UniqueNameEntity<PK extends Serializable> extends BasicNameEntity<PK>
{

	/** The serial Version UID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new {@link UniqueNameEntity} with the given name
	 *
	 * @param name
	 *            the name
	 */
	public UniqueNameEntity(String name)
	{
		super(name);
	}

}