package org.open18.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Tee generated by hbm2java
 */
@Entity
@Table(name = "TEE")
public class Tee implements java.io.Serializable {

    private TeeId id;
    private TeeSet teeSet;
    private Hole hole;
    private int distance;

    public Tee() {
    }

    public Tee(TeeId id, TeeSet teeSet, Hole hole, int distance) {
        this.id = id;
        this.teeSet = teeSet;
        this.hole = hole;
        this.distance = distance;
    }

    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "teeSetId", column = @Column(name = "TEE_SET_ID", nullable = false)),
            @AttributeOverride(name = "holeId", column = @Column(name = "HOLE_ID", nullable = false))})
    @NotNull
    public TeeId getId() {
        return this.id;
    }

    public void setId(TeeId id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEE_SET_ID", nullable = false, insertable = false, updatable = false)
    @NotNull
    public TeeSet getTeeSet() {
        return this.teeSet;
    }

    public void setTeeSet(TeeSet teeSet) {
        this.teeSet = teeSet;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HOLE_ID", nullable = false, insertable = false, updatable = false)
    @NotNull
    public Hole getHole() {
        return this.hole;
    }

    public void setHole(Hole hole) {
        this.hole = hole;
    }

    @Column(name = "DISTANCE", nullable = false)
    @NotNull
    @Min(1)
    @Max(999)
    public int getDistance() {
        return this.distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

}
