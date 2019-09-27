package de.alpharogroup.basentcore.jpa.entity;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import de.alpharogroup.db.entity.name.IdentifiableNameable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

/**
 * The class {@link BasicNameEntity} is a base entity for a table with a single value
 *
 * @param <PK>
 *            the generic type of the id
 */
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class BasicNameEntity<PK extends Serializable> extends BaseSequenceEntity<PK>
	implements IdentifiableNameable<PK>
{

	/** The serial Version UID. */
	private static final long serialVersionUID = 1L;

	/** The name. */
	String name;

}