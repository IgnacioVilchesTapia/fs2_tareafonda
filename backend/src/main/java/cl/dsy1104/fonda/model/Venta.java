package cl.dsy1104.fonda.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Muchas ventas pueden apuntar a la misma bebida.
    @ManyToOne(optional = false)
    @JoinColumn(name = "bebida_id", nullable = false)
    private Bebida bebida;

    @Column(name = "unidades", nullable = false)
    private Integer unidades;

    // Nulo cuando la venta se rechaza: no se cobro nada.
    @Column(name = "total")
    private Integer total;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false, length = 20)
    private EstadoVenta estado;

    // Nulo cuando la venta se autoriza.
    @Enumerated(EnumType.STRING)
    @Column(name = "motivo_rechazo", length = 30)
    private MotivoRechazo motivoRechazo;

    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;

    public Venta() {
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Bebida getBebida() { return bebida; }
    public void setBebida(Bebida bebida) { this.bebida = bebida; }

    public Integer getUnidades() { return unidades; }
    public void setUnidades(Integer unidades) { this.unidades = unidades; }

    public Integer getTotal() { return total; }
    public void setTotal(Integer total) { this.total = total; }

    public EstadoVenta getEstado() { return estado; }
    public void setEstado(EstadoVenta estado) { this.estado = estado; }

    public MotivoRechazo getMotivoRechazo() { return motivoRechazo; }
    public void setMotivoRechazo(MotivoRechazo motivoRechazo) { this.motivoRechazo = motivoRechazo; }

    public LocalDateTime getFecha() { return fecha; }
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }
}
