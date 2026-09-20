package cl.dsy1104.fonda.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bebida")
public class Bebida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false, length = 20)
    private TipoBebida tipo;

    // Nombre explicito: la estrategia de nombres de Spring convertiria
    // "volumenML" en "volumenml", y data.sql usa "volumen_ml".
    @Column(name = "volumen_ml", nullable = false)
    private Integer volumenML;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    // Solo ALCOHOLICA (nulo en SIN_ALCOHOL)
    @Column(name = "grados_alcohol")
    private Double gradosAlcohol;

    // Solo ALCOHOLICA (nulo en SIN_ALCOHOL)
    @Column(name = "certificada")
    private Boolean certificada;

    // Solo SIN_ALCOHOL (nulo en ALCOHOLICA)
    @Column(name = "azucar_por_litro")
    private Integer azucarPorLitro;

    @Column(name = "venta_restringida", nullable = false)
    private boolean ventaRestringida;

    public Bebida() {
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public TipoBebida getTipo() { return tipo; }
    public void setTipo(TipoBebida tipo) { this.tipo = tipo; }

    public Integer getVolumenML() { return volumenML; }
    public void setVolumenML(Integer volumenML) { this.volumenML = volumenML; }

    public Integer getStock() { return stock; }
    public void setStock(Integer stock) { this.stock = stock; }

    public Double getGradosAlcohol() { return gradosAlcohol; }
    public void setGradosAlcohol(Double gradosAlcohol) { this.gradosAlcohol = gradosAlcohol; }

    public Boolean getCertificada() { return certificada; }
    public void setCertificada(Boolean certificada) { this.certificada = certificada; }

    public Integer getAzucarPorLitro() { return azucarPorLitro; }
    public void setAzucarPorLitro(Integer azucarPorLitro) { this.azucarPorLitro = azucarPorLitro; }

    public boolean isVentaRestringida() { return ventaRestringida; }
    public void setVentaRestringida(boolean ventaRestringida) { this.ventaRestringida = ventaRestringida; }
}
