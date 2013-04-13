package gui;

import service.Service;
import entidades.Borracharia;
import entidades.Documento;
import entidades.DocumentoAnual;
import entidades.Frete;
import entidades.Motorista;
import entidades.Pneu;
import entidades.Veiculo;
public class App {
	
	public static void main(String[] args) {

		
		 		//use the persistence unit defined into the persistence.xml file
				/**EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoFinalJavaWebPersistencia");
				EntityManager em = emf.createEntityManager();
				BorrachariaService service = new BorrachariaService(em);
				MotoristaService servicemotora = new MotoristaService(em);**/
				Borracharia borra = new Borracharia();
				Pneu pneu = new Pneu();
				Motorista motoraMotorista = new Motorista();
				Frete frete = new Frete();
				Veiculo veiculo = new Veiculo();
				//Service <Borracharia> freteborra = new Service<Borracharia>();
				//Service <Pneu> fretepneu = new Service<Pneu>();
				Service<DocumentoAnual> daoDocAnu = new Service<DocumentoAnual>();
				DocumentoAnual docAnu = new DocumentoAnual();
				Service<Documento> daoDoc = new Service<Documento>();
				Documento doc = new Documento();
				
				// create and persist an employee
				/**em.getTransaction().begin();
				Borracharia borracharia = service.createEmployee(1, "ASDF", "ASDF", "ASDF", "ASDF");
				em.getTransaction().commit();
				System.out.println("Persisted " + borracharia);**/
				
				
				//create motora
				/**em.getTransaction().begin();
				motoraMotorista = servicemotora.CreateMotorista(1, "tadeu", "1231232", "123213", "43423", "1241412", "2014", "gasolina");
				em.getTransaction().commit();
				System.out.println("persistido" + motoraMotorista);**/
				
				pneu.setAro(13);
				pneu.setBanda(60);
				//pneu.setCodigo(2);
				pneu.setLargura(145);
				pneu.setMarca("Bridgestone");
				pneu.setModelo("Pneu de Carro");
				pneu.setCodigo(2);
				//borra.setCodigo(2);
				borra.setContato("jose");
				borra.setDescricao("asdf");
				borra.setLocal("asdf");
				borra.setTelefone("234");
				
				docAnu.setCodigo(1);
				docAnu.setcodDocumento(1);
				docAnu.setAnoExercicio("2010");
				docAnu.setDataPagamento("01/01/2001");
				docAnu.setDocumentoPago("01/05/2000");
				docAnu.setValorPago(65468);
				docAnu.setValorPrevisto(465);
				
				doc.setCodigo(1);
				
				
				daoDocAnu.create(docAnu);
				//freteborra.create(borra);
				//fretepneu.create(pneu);
				
				//update da borracharia
				/**em.getTransaction().begin();
				borra.setCodigo(1);
				borra.setContato("fsjldfjsd");
				borra.setDescricao("fasdasd");
				borra.setLocal("2323");
				borra.setTelefone("12");
				em.merge(borra);
				em.getTransaction().commit();
				System.out.println(borra.getDescricao());**/
				
				
				
				// find all borracharia
				/**List<Borracharia> borra = service.findAllBorracharia();
				for (Borracharia e : borra)
					System.out.println("Found Borracharia: " + e.getDescricao());*/

				
				
				// find a specific borracharia
				/**borra = service.findBorracharia(1);
				System.out.println("Found " + borra.getLocal());*/

				// remove an employee
				/**em.getTransaction().begin();
				service.removeBorracharia(1);
				em.getTransaction().commit();
				System.out.println("Removed Employee 1");*/

						
				// close the EM and EMF when done
				/**em.close();
				emf.close();*/
	}

}
