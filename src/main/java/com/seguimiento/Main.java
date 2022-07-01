package com.seguimiento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.seguimiento.model.*;
import com.seguimiento.repository.*;
import com.seguimiento.repository.categoria.CategoriaRepository;
import com.seguimiento.repository.mes.MesRepository;
import com.seguimiento.repository.usuario.UsuarioRepository;

import utils.SHA512;

import com.seguimiento.repository.proveedor.ProveedorRepository;
import com.seguimiento.repository.suscripcion.SuscripcionRepository;

@SpringBootApplication
public class Main implements CommandLineRunner {

	@Autowired
	public UsuarioRepository usuarioRepo;
	@Autowired
	public ProveedorRepository proveedorRepo;
	@Autowired
	public CategoriaRepository categoriaRepo;
	@Autowired
	public MesRepository mesRepo;

	public static void main(String args[]) {
		SpringApplication.run(Main.class, args);
	}

	public void run(String... arg0) throws Exception {
		UsuarioSeeder();
		ProveedorSeeder();
		CategoriaSeeder();
		MesSeeder();
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurer() {
	            
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/**").allowedOrigins("*").allowedMethods("*").allowedHeaders("*");
	            }
	        };
	    }
	
	public void UsuarioSeeder() {
		Usuario user1 = new Usuario(99662345, SHA512.sha256("99662345p"), "Pedro Zapata S.", "pedritoperu@hotmail.com", 954786254, "Jr. Comillas Mz. T Lte. 7, Los Olivos", 1563, "Credito","usuario");
		Usuario user2 = new Usuario(45773587, SHA512.sha256("45773587f"), "Fernanda Jimenez", "jimefer89@gmail.com", 995778234, "Ca. Hilos Mz. U Lte. 2, Comas", 1436, "Credito","usuario");
		Usuario user3 = new Usuario(65663125, SHA512.sha256("65663125h"), "Hans Olivas", "hansolivas1@gmail.com", 942359617, "Av. Alonso Ugarte #543, Surco", 1587, "Efectivo","usuario");
		Usuario user4 = new Usuario(123, SHA512.sha256("admin"), "Admin", "admin@admin.com", 999999999, "PaginaSeguimiento", 9999, "Debito","admin");
		Usuario user5 = new Usuario(12, SHA512.sha256("123"), "TestUser", "testuser@admin.com", 999999999, "PaginaSeguimiento", 9999, "Debito","usuario");
		usuarioRepo.save(user1);
		usuarioRepo.save(user2);
		usuarioRepo.save(user3);
		usuarioRepo.save(user4);
		usuarioRepo.save(user5);
	}

	public void ProveedorSeeder() {
		Proveedor proveedor1 = new Proveedor("Youtube", "Youtube Premium", "Entretenimiento", 30.00, "www.youtube.com",
				"youtube.google@gmail.com");
		Proveedor proveedor2 = new Proveedor("Spotify", "Spotify Premium", "Musica", 9.20, "www.open.spotify.com",
				"spotifypremium@spotify.com");
		Proveedor proveedor3 = new Proveedor("Netflix", "Netflix", "Peliculas y Series", 45.60, "www.netflix.com",
				"netflix@netflix.com.latam");
		Proveedor proveedor4 = new Proveedor("El Comercio", "El Comercio", "Noticias", 10.50, "www.elcomercio.pe",
				"elcomercioperu@elcomercio.pe");
		Proveedor proveedor5 = new Proveedor("Amazon Prime", "Prime Video", "Peliculas y Series", 17.00, "www.primevideo.com",
				"primevideocl@amazon.com");
		Proveedor proveedor6 = new Proveedor("HBO", "HBO Max", "Peliculas y Series", 14.90, "www.hbomax.com",
				"hbomax@warnermediagp.com");
		Proveedor proveedor7 = new Proveedor("Disney", "Disney+", "Peliculas y Series", 26.00, "www.disneyplus.com",
				"disneypluscls@disney.com");
		Proveedor proveedor8 = new Proveedor("Paramount", "Paramount+", "Peliculas y Series", 15.00, "www.paramountplus.com",
				"paramountplusu@paramount.com");
		proveedorRepo.save(proveedor1);
		proveedorRepo.save(proveedor2);
		proveedorRepo.save(proveedor3);
		proveedorRepo.save(proveedor4);
		proveedorRepo.save(proveedor5);
		proveedorRepo.save(proveedor6);
		proveedorRepo.save(proveedor7);
		proveedorRepo.save(proveedor8);
	}

	public void CategoriaSeeder() {
		Categoria categoria1 = new Categoria("Peliculas y Series");
		Categoria categoria2 = new Categoria("Musica");
		Categoria categoria3 = new Categoria("Noticias");
		Categoria categoria4 = new Categoria("Entretenimiento");
		this.categoriaRepo.save(categoria1);
		this.categoriaRepo.save(categoria2);
		this.categoriaRepo.save(categoria3);
		this.categoriaRepo.save(categoria4);
	}
	
	public void MesSeeder() {
		Mes mes1 = new Mes(1,"Enero");
		Mes mes2 = new Mes(2,"Febrero");
		Mes mes3 = new Mes(3,"Marzo");
		Mes mes4 = new Mes(4,"Abril");
		Mes mes5 = new Mes(5,"Mayo");
		Mes mes6 = new Mes(6,"Junio");
		Mes mes7 = new Mes(7,"Julio");
		Mes mes8 = new Mes(8,"Agosto");
		Mes mes9 = new Mes(9,"Septiembre");
		Mes mes10 = new Mes(10,"Octubre");
		Mes mes11 = new Mes(11,"Noviembre");
		Mes mes12 = new Mes(12,"Diciembre");
		this.mesRepo.save(mes1);
		this.mesRepo.save(mes2);
		this.mesRepo.save(mes3);
		this.mesRepo.save(mes4);
		this.mesRepo.save(mes5);
		this.mesRepo.save(mes6);
		this.mesRepo.save(mes7);
		this.mesRepo.save(mes8);
		this.mesRepo.save(mes9);
		this.mesRepo.save(mes10);
		this.mesRepo.save(mes11);
		this.mesRepo.save(mes12);
	}

}