package edu.ejemplo.kevroman.colegio3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.Locale;

public class ResultadoColegioActivity extends AppCompatActivity implements ClickColegio{
    private RecyclerView recyclerView;
    private AdapterColegio adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_colegio);
        recyclerView = (RecyclerView)findViewById(R.id.recycler_resultado);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AdapterColegio(new ArrayList<Colegio>(),this);
        recyclerView.setAdapter(adapter);

        agregarDatos();
    }
    public void agregarDatos(){
        try {
            Categorias colegio = (Categorias) ObjectSerializer.deserialize(getIntent().getStringExtra("Colegio"));
            Log.d("agregarDatos", colegio.getNombre());
            Colegio(colegio);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void Colegio(Categorias colegio){
        switch (colegio.getNombre()){
            case "Santa Teresita":
               adapter.addColegio(new Colegio(R.drawable.santa_teresita,"Santa Teresita","El Colegio Santa Teresita inició sus labores el 2 de enero de 1930, bajo la protección de Santa Teresita. La Srta. Rosa Molina Midence y un grupo de colaboradoras, deseosas de formar a la juventud guatemalteca con bases profundamente cristianas, dieron inicio a esta obra educativa con miras a entregarla más tarde a una congregación religiosa."));
                break;

            case "Belga":
                adapter.addColegio(new Colegio(R.drawable.belga,"Belga Guatemalteco","Somos una obra educativa de las Hermanas de la Congregación de la Sagrada Familia de Helmet, originaria de Bélgica, quienes desde sus inicios han acompañado nuestra labor.\n" +
                        "\n" +
                        "Desde 1933, contamos con una trayectoria de experiencia educativa que nos ha permitido lograr un sólido prestigio en Guatemala. Somos una comunidad de aprendizaje en donde el educando y la educanda son protagonistas de una pedagogía rica en valores humanos y cristianos, que promueve el crecimiento intelectual, personal y espiritual para desarrollar un alto sentido de servicio, responsabilidad y participación."));
                break;
            case "Junkabal":
                adapter.addColegio(new Colegio(R.drawable.jumkabal,"Fundacion Junkabal","Es el centro técnico de Junkabal que ofrece formación integral en las áreas de belleza, artes culinarias y en el área administrativa. \n" +
                        "\n" +
                        "Dentro de las diversas carreras que se incluyen en cada área se encuentran las de Chef y Estilista que cuentan con el aval del Ministerio de Educación y el Diplomado en Redes Sociales que tiene el respaldo de las Universidades Tecnológicas de El Salvador y Honduras.\n" +
                        "\n" +
                        "Todas nuestras carreras y cursos están disponibles para mujeres a partir de los 14 años y el único requisito, de la mayoría de los cursos son saber leer y escribir, a excepción de Redes Sociales y Chef, que requieren formación previa a nivel básico.\n" +
                        "\n" +
                        "Complementamos nuestros pensum de estudios con seminarios y talleres brindados por expertos en diversas áreas técnicas especializadas, emprendimiento, habilidades para el empleo y clases de desarrollo humano."));
                break;
            case "Bethania":
                adapter.addColegio(new Colegio(R.drawable.bethania,"Bethania","Bethania es un centro educativo privado para niñas y señoritas, fundado y dirigido desde 1,955 por la Congregación de Hermanas de Bethania, Consoladoras de la Virgen Dolorosa. El objetivo fundamental de Bethania, es conformar una comunidad académica donde todos se preocupen por vivenciar la filosofía de Bethania, el conocimiento crítico, el pensamiento de la Iglesia Católica; en un ambiente responsable, fraternal y de convivencia afectiva para lograr una formación integral en las alumnas. Cuenta con todos los niveles educativos; Pre-Primaria, Primaria, Básicos y Diversificado, en este nivel cuenta con opción a carreras; Bachillerato en Ciencias y Letras, Bachillerato en Ciencias y Letras con orientación en Diseño Gráfico, y Magisterio de Pre-Primaria Bilingüe Inglés – Español.La jornada es matutina, de lunes a viernes, en horario de :\n" +
                        "7:15a.m. a 1:00 pm. para Pre-Primaria\n" +
                        "7:15a.m. a 2:00 p.m. para los otros niveles"));
                break;
            case "Casa Central":
                adapter.addColegio(new Colegio(R.drawable.casa_central,"Casa Centra","Era 1862. El país era gobernado por Rafael Carrera y la capital era una pequeña ciudad que terminaba donde en la actualidad se encuentra el Cementerio General. Ya casi en las afueras se ubicaba también el Hospital San Juan de Dios. Ese mismo año, los frailes que administraban este nosocomio, la orden de los Hermanos Hospitalarios de San Juan de Dios, lo entregaron y pasó a ser atendido por otras órdenes."));
                break;
            case "El Rosario":
                adapter.addColegio(new Colegio(R.drawable.rosario,"El Rosario","Fundado el 7 de octubre de 1952, bajo la protecciòn de la Santìsima Virgen Marìa en su advocaciòn del Rosario."));
                    break;
            case "Maria Auxiliadora":
                adapter.addColegio(new Colegio(R.drawable.maria_auxiliadora,"Maria Auxiliadora","El instituto de las Hijas de María Auxiliadora, fue fundado por San Juan Bosco y Santa María Mazzarello en el año 1872, en Italia como respuesta de salvación a las aspiraciones profundas de las jóvenes más pobres.\n" +
                        "\n" +
                        "Inspirado en la caridad de Cristo Buen Pastor y conla solicitud materna de María, Don Bosco ideo el Sistema Preventivo que basado en la Razón, religión y Amabilidad favorece una relación familiar armoniosa y profunda entre educador y educando y hace de la educación un quehacer consciente, vivido en clima de corresponsabiliidad y alegría la novedad del carisma salesiano y la adaptación creativa que de el hizo Madre Mazzarello para la educación de las jóvenes fueron la razón de la vitalidad y fuerza de expansión que el Instituto de las Hijas de María Auxliadora tuvo el principio, llegando a América; llegando a El Salvador en el año 1903, de donde se expandieron a los demás países de Centro América. Llegando a Guatemala en el año 1954."));
                break;
            case  "La Asunción":
                adapter.addColegio(new Colegio(R.drawable.la_asuncion,"La Asuncion","La acción educativa del Colegio La Asunción pretende lograr el desarrollo integral de la persona a través de una sólida formación humana, espiritual, social, cultural e intelectual, para que esta formación ejerza influencia evangélica y transformadora en la sociedad."));
                break;
            case "Monte Maria":
                adapter.addColegio(new Colegio(R.drawable.monte_maria,"Monte Maria","En el año 2013, la Asociación Monte María (AMM), nombra a Jimena Castillo como Directora General y Lucrecia Coloma como Administradora. En el 2014, asume el cargo de administradora Raquel Ortíz de Vettorazzi y en el 2015 se retira del cargo la Directora General. Se nombra a una Directora por Nivel, según requerimiento del Ministerio de Educación. El Departamento de Evangelización se une a las Direcciones de Nivel conformando así el Equipo Directivo."));
                break;
            case "Campo Alegre":
                adapter.addColegio(new Colegio(R.drawable.campo_alegre,"Campo Alegre","Hace más de cuarenta años, unos padres de familia conscientes de su derecho y deber irrenunciable sobre la formación de los hijos, se empeñaron en promover unos colegios donde recibieran una educación que fuese una continuación de la que procuraban en su familia."));
                break;
            case "Santa Inés":
                adapter.addColegio(new Colegio(R.drawable.santa_ines,"Santa Inés","Av S.Cañas 6-11 Z-2"));
                break;
            case "Don Bosco":
                adapter.addColegio(new Colegio(R.drawable.don_bosco,"Don Bosco","El Colegio Don Bosco de Guatemala es una Institución Educativa Salesiana, inspirada en el carisma de San Juan Bosco, que bajo la luz del Sistema Preventivo propuesto por el Padre y Maestro de la Juventud, responde a las líneas magisteriales de la Congregación Salesiana, presente en más de 115 países del mundo.\n" +
                        "\n" +
                        "La propuesta pastoral académica, artística, cultural, tecnológica y deportiva de nuestra institución educativa, es siempre pionera, ofreciendo a nuestros alumnos, servicios educativo-pastorales pertinentes, flexibles, de calidad, innovadores y de última generación. El Colegio Salesiano Don Bosco es modelo y pionero en la educación de nuestro país. Desde su fundación, en 1932, su contribución a la sociedad ha sido reconocida tanto a nivel nacional, como internacional. Prueba de ello es que en 1958, fue declarado el Mejor Colegio de Guatemala, y a lo largo de su historia, gran cantidad de antiguos alumnos de esta Casa han ocupado cargos públicos y se han destacado en el ámbito profesional a nivel mundial."));
                break;
            case "San Sebastian":
                adapter.addColegio(new Colegio(R.drawable.san_sebastian,"San Sebastian","El Colegio Don Bosco de Guatemala es una Institución Educativa Salesiana, inspirada en el carisma de San Juan Bosco, que bajo la luz del Sistema Preventivo propuesto por el Padre y Maestro de la Juventud, responde a las líneas magisteriales de la Congregación Salesiana, presente en más de 115 países del mundo.\n" +
                        "\n" +
                        "La propuesta pastoral académica, artística, cultural, tecnológica y deportiva de nuestra institución educativa, es siempre pionera, ofreciendo a nuestros alumnos, servicios educativo-pastorales pertinentes, flexibles, de calidad, innovadores y de última generación. El Colegio Salesiano Don Bosco es modelo y pionero en la educación de nuestro país. Desde su fundación, en 1932, su contribución a la sociedad ha sido reconocida tanto a nivel nacional, como internacional. Prueba de ello es que en 1958, fue declarado el Mejor Colegio de Guatemala, y a lo largo de su historia, gran cantidad de antiguos alumnos de esta Casa han ocupado cargos públicos y se han destacado en el ámbito profesional a nivel mundial."));
                break;
            case "San Jose de los Infantes":
                adapter.addColegio(new Colegio(R.drawable.infantes,"San Jose de los Infantes","Después que la ciudad de Guatemala se trasladó de Antigua Guatemala para el Valle de la Virgen, formándose así la Ciudad de la Nueva Guatemala de la Asunción, es la época cuando el 10 de junio de 1781 fue fundado el Colegio San José de los Infantes de la Santa Iglesia Catedral Metropolitana, por el IV Arzobispo de Guatemala, Don Cayetano Francos y Monroy.\n" +
                        "El Colegio de Infantes fue creado con carácter Catedralicio, es decir, que los alumnos debían servir como monaguillos y formar parte del coro de la Catedral, al estilo de los colegios que funcionaban en Europa.\n"+"Sus primeros alumnos fueron doce, de los cuales sólo dos no se ordenaron de sacerdotes; estos alumnos fueron seleccionados atendiendo su calidad de voz que poseían para el canto. Estos fueron los primeros “Seises” guatemaltecos, y así prosiguieron siempre en número doce, hasta que el colegio aumentó el número de sus alumnos.\n" +
                        "El primero que tuvo a su cargo la rectoría del Colegio de Infantes fue el Canónigo Don Ignacio Fernández Álvarez.\n" +
                        "El segundo rector fue el señor Canónigo Chantre, Don Isidro Sicilia, que fue el Pbro. Dr. Don Manuel.\n"+"Aguado, personaje de mucha valía; Dr. De la Sapiencia de Roma, catedrático de la Universidad de San Carlos de Borromeo. Prestó sus servicios de Bachiller de manera gratuita.\n" +
                        "A Don Manuel Aguado, le siguen como Rectores del Colegio de Infantes, los siguientes Sacerdotes: Cuarto Pbro. Isidro Díaz Clemente; Quinto Pbro. Manuel Ignacio Cárcamo; Sexto Pbro. Francisco García Guillén; Séptimo Pbro. Antonio Francisco Rodríguez; Octavo Pbro. Buenaventura Rojas; Noveno Dr. Mariano García Reyes; Décimo Pbro. Serapio Contreras; Décimo Primero José Mariano Domínguez; Décimo Segundo Pbro. Máximo Gallegas; Décimo Tercero Manuel Paúl.\n"+"Al Pbro. Manuel Paúl le sucede el Canónigo José A. Alvarado, quien se interesó mucho por la educación primaria en nuestro país, además, durante su rectorado se rinde por primera vez, homenaje al segundo patrono del Colegio de Infantes, quien es, Santo Dominguito de Val en 1895.\n" +
                        "Luego nombran al Pbro. Manuel Cecilio Espinoza quien sigue con las celebraciones del segundo patrono, el día 11 de septiembre de cada año, quien mandó esculpir las imágenes de dicho santo.\n" +
                        "Luego es nombrado el Canónigo Don Pedro García, a quien sigue después el Pbro. Don Guadalupe Valenzuela.\n"+"En 1968, con motivo del inicio de los trabajos de restauración total del edificio, el espacio para aulas quedó limitado en la mitad, por ello el Rector Cristóbal Ramírez estableció doble jornada de trabajo, para poder servir a todos los alumnos inscritos: jornada matutina para el nivel primario, jornada vespertina para el ciclo básico y bachillerato en ciencias y letras. Al terminarse la reconstrucción, continuó la jornada doble, por el aumento de inscripciones de alumnos. El Rector P. Ramírez con el propósito de servir al gran número de solicitudes de inscripción, ensanchó el número de aulas en dos edificios anexos al Colegio Central. El primero en la 8ª. Avenida, 8-14, donde comenzó a funcionar el nivel pre-primario, en el segundo piso, y luego sólo la academia de mecanografía. En el tercer piso fueron instalados laboratorios de Física, Química y Biología.\n"+"El segundo anexo está situado en la 8ª. Avenida 9-60, zona 1. Este edificio fue reacondicionado por un arquitecto de la manera más adecuada para el nivel pre-primario, (párvulos y preparatoria), y además primeros y segundos grados con varias secciones, más una sección de tercero, todos del nivel primario.\n" +
                        "Además, el P. Ramírez, preocupado por el desarrollo físico de los alumnos, a través de los buenos oficios del Tesorero de la Arquidiócesis, Monseñor Tomás Barrios, obtuvo la anuencia del señor Arzobispo, Monseñor Próspero Penados del Barrios para que el Colegio de Infantes usufructúe un área amplia en el terreno del Seminario de la Arquidiócesis de Guatemala, espacio de campo donde se principió a construir en marzo de 1988, instalaciones adecuadas técnicamente para la educación física y los principales deportes. Esta obra ya está en su fase final. El área mencionada se ubica al poniente de “Aldeas Infantiles” y al sur de “Fraternidad Misionera de María”, calle de por medio, zona 7 (zona 3 de Mixco).\n"+"Otra disposición del Señor Arzobispo Metropolitano, Monseñor Próspero Penados del Barrio a favor del Colegio de Infantes en 1989 fue la autorización a efecto de que en la misma área del Complejo Deportivo, se construyera con fondos del colegio, ahorrados por el Rector P. Cristóbal Ramírez, dos módulos para doce aulas. Según el proyecto aprobado por el Señor Arzobispo, serían trasladados a estas instalaciones los niños de párvulos, preparatoria y primeros y segundos de primaria, que en ese entonces estudiaban en el anexo de la 8ª. Avenida 9-60 de la zona 1. Esas aulas nuevas serían plenamente funcionales en sentido pedagógico y con la ventaja de las instalaciones deportivas y recreativas a la mano. Dicho proyecto iniciaría para el ciclo escolar 1990"));
                break;
            case "San Pablo":
                adapter.addColegio(new Colegio(R.drawable.san_pablo,"San Pablo","Vision: Formar personas con sólidas competencias que interpreten su realidad de forma crítica, creativa, proactiva  y dinámica.\n" +
                        "\n" +
                        "Que tengan una fe fuerte como fundamento de sus vidas siguiendo el proyecto de Jesús .\n" +
                        "\n" +
                        "Hombres y mujeres solidarios , disponibles, emprendedores, independientes que amen y aporten soluciones a su país.\n" +
                        "\n" +
                        "Se conozcan, valoren y amen como creación perfecta de Dios.\n"+"Mision: Somos un colegio católico dedicado a educar integralmente al individuo basándonos en los principios y valores del evangelio .\n" +
                        "\n" +
                        "-Dedicados a formar jóvenes y señoritas con excelencia académica utilizando métodos de vanguardia y tecnología para enfrentar los retos del siglo , que les permitan desarrollar todas sus competencias como personas integrales, independientes y respetuosas."));
                break;
            case "Fundacion Kinal":
                adapter.addColegio(new Colegio(R.drawable.kinal,"Fundación Kinal","De 1961 a 1970\n" +
                        "En la cabecera del municipio de Mixco (1961 a 1963), atendiéndose los fines de semana, con actividades deportivas, de formación humana y de formación espiritual y moral. En la zona 4 (1964) próximo a la terminal de autobuses, donde se facilitó la atención entre semana, y por su localización se aumentó la participación de personas de otros lugares próximos a la ciudad. Se dictaron cursos de carpintería, mecánica automotriz y electricidad, continuaron las actividades deportivas para adultos. Dió inicio el club juvenil para los hijos de los obreros; para todos, según sus niveles, se organizaron clases y grupos de estudio de formación humana y espiritual. La tercera sede fue en la calle Martí, zona 6 de la ciudad (1965 a 1970). Se realizaron otros cursos con orientación laboral, como albañilería, formación de maestros de obra, relaciones humanas, además de los que ya se habían llevado a cabo en la anterior sede. Se organizó una liga deportiva con categoría juvenil y posteriormente una infantil; primero se contó con 8 equipos y se llegó a tener 28. Las actividades de formación humana y espiritual atrajeron a un mayor número de personas.\n"+"De 1971 a 1980\n" +
                        "En esta etapa se desarrollaron actividades en la zona 3 de la ciudad, en una casa proporcionada por la Fundación Camhi, próxima al actual basurero municipal. Aquí se organizó un Patronato y se iniciaron contactos estables con empresas que envían personal a cursos de capacitación laboral. Dentro del programa deportivo se impulsó y promovió la participación en ligas y actividades deportivas, como clínicas deportivas, excursiones, tanto de jóvenes como adultos. El Club Juvenil atendió además reuniones culturales, visitas, proyección de documentales y películas, cursos de métodos de estudio y oficios para jóvenes. El programa de formación humana, doctrinal y espiritual, comprendió cursos de orientación matrimonial, educación de los hijos, moral y ética y otros más. En los tres programas, el 70% eran provenientes de la capital y el 30% de municipios y departamentos próximos.\n"+"De 1981 a 1990\n" +
                        "En este período, durante los 3 primeros años continuaron actividades en la zona 3, y desde abril de 1984 en una sede localizada en la 3a. Avenida 10-69 de la zona 1. Dentro del programa de capacitación laboral se estableció una distinción entre cursos técnicos y laborales propiamente y los cursos de actitudes ante el trabajo. Dentro del primer grupo se realizaron actividades como en los años anteriores, dirigidos a grupos definidos por una ocupación determinada, como pilotos de transporte pesado, electricistas industriales, lubricadores de maquinaria, bodegueros, mensajeros, vendedores, conserjes, cobradores, etc; Para todos los trabajadores sin distinción de su oficio se promovieron el curso de Desarrollo Personal y administrativo y el curso Superación Personal y Familiar, que buscan un mejoramiento de actitudes frente al trabajo, la familia y la comunidad social donde se desenvuelven.\n" +
                        "\n" +
                        "En 1984 se constituyó un grupo promotor de Kinal para transformarlo en un centro educativo técnico, dando principal atención a la capacitación en las actividades que ya se organizaban. Al mismo tiempo se buscó un terreno donde construir una sede definitiva, cercana al lugar donde estuvo catorce años y con instalaciones adecuadas a la enseñanza técnica.\n" +
                        "\n" +
                        "En 1986 se recibió en donación un terreno, otorgado por el Ing. Juan Mini Feltrín, localizado en la sexta avenida 13-54 de la zona 7, Colonia Landívar, y se inició la recaudación de fondos para la construcción de la nueva sede. Al mismo tiempo se realizaron las gestiones para dar personería jurídica al Centro. En 1987 se constituyó la Fundación Kinal, aprobada por el Acuerdo Gubernativo 973-87 el 5 de noviembre de 1987. En enero de 1988 se trasladó Kinal a sus nuevos edificios, que constituyen la primera de varias etapas que se tienen planificadas. La construcción, de 2,000 metros cuadrados, comprende: talleres, aulas, biblioteca, auditórium, zona de estar y cafetería, oratorio, oficinas, servicios generales y clínica médica-odontológica. También cuenta con instalaciones deportivas y áreas para construir más talleres.\n"+"De 1991 a 2000\n" +
                        "De 1991 a 1994 Kinal diversifica sus programas. Se consigue autorización del Ministerio de Educación para impartir clases de bachillerato, las cuales se ofrecen a los alumnos jóvenes junto con una carrera técnica. En clases diarias por la mañana. Conforme el numero de alumnos fue aumentando se impartieron clases por la tarde. Se continua impartiendo cursos libres para personal que labora en empresas. El año de 1994 se inicia la ampliación de instalaciones físicas del Centro Kinal, y se finaliza en 1996, sobresale un edificio de 3,000 mts con talleres, laboratorios y aulas. Además se cuentan con una capilla, clínica medica, cancha polideportiva y se amplio el parqueo de vehículos.\n" +
                        "\n" +
                        "En 1995 se inicia un programa experimental, en el cual los alumnos obtienen un perito técnico con reconocimiento del Ministerio de Educación. El éxito del programa hace que el numero de alumnos siga en continuo aumento. Junto con este perito los alumnos pueden obtener su bachillerato.\n" +
                        "\n" +
                        "En 1996 se inicia un proyecto de equipamiento con el Ministerio de Asuntos Exteriores de Italia, el cual comprende laboratorios de electricidad, electrónica, automatización. Además se recibe la visita de voluntarios y cooperantes quienes orientan la estructura de los programas para incluir los nuevos equipos. En 1998 Kinal inicia un proyecto de equipamiento de talleres de Mecánica Automotriz, Refrigeración y Soldadura. Además de equipo se consigue implementar una biblioteca técnica, en la cual los alumnos pueden realizar consultas. El centro cuenta con un laboratorio de computación, se consigue abrir un segundo laboratorio, pero este esta abierto para que los alumnos realicen sus tareas, ya que no cuentan con computador en sus casas. En 1999 los cursos libres se trasladan a la modalidad de curso anual. Se inicia en este año un programa piloto dirigido a personas con titulo medio para se especialicen en electricidad o electrónica."));
                break;
            case "Robel":
                adapter.addColegio(new Colegio(R.drawable.roble,"El Roble","Hace más de cuarenta años, unos padres de familia conscientes de su derecho y deber irrenunciable sobre la formación de los hijos, se empeñaron en promover unos colegios donde recibieran una educación que fuese una continuación de la que procuraban en su familia."));
                break;
            case "AmeriTec":
                adapter.addColegio(new Colegio(R.drawable.ameritec,"AmeriTec","Se fundó en 1998 como un Colegio Privado, coeducacional, bilingüe y laico.\n" +
                        "\n" +
                        "El Colegio AMERITEC les proporciona todas las facilidades educativas que promueven el desarrollo máximo del potencial de sus hijos.\n" +
                        "\n" +
                        "Nuestros programas satisfacen las necesidades cognoscitivas, motrices, afectivas y sociales, para que descubran por si mismos los sentimientos de confianza, autoestima e independencia; garantizando un desarrollo exitoso."));
                break;
            case "Rafael Landivar":
                adapter.addColegio(new Colegio(R.drawable.rafael_landivar,"Rafael Landivar","Fundación el 16 de agosto de 1967"));
                break;
            case "Liceo Guatemala":
                adapter.addColegio(new Colegio(R.drawable.liceo_guatemala,"Liceo Guatemala","La celebración de los 25 años, en  1957, se aprovechó para condecorar al H. Rodolfo como uno de los pioneros de la obra marista en Guatemala.\n" +
                        "\n" +
                        "Las instalaciones existentes del Liceo Guatemala a todas luces se quedaron pequeñas para albergar a todos los alumnos que estaban estudiando o se pretendían matricular. Por tal motivo se pensó en ampliar la secundaria.  Se decidió construir en la parte de los terrenos que hasta entonces se dedicaban a campos de juego.\n" +

                        "\n" +
                        "Los planos de la hermosa Capilla del Liceo se deben al Ingeniero Alfredo Obiols.  El 6 de junio de 1954 se colocó la primera piedra, con la bendición del Nuncio Apostólico.  Los frescos del templo los pintó el artista guatemalteco Carlos Rigalt Anguiano.  Fue inaugurada en el año 1956."));
                break;
            case "Imbpc":
                adapter.addColegio(new Colegio(R.drawable.imbpc,"IMB-PC","Buscamos formar profesionales que dejen huella en nuestra comunidad, país y región, que nos representen de forma honorable en esta nueva generación."));
                break;
            case "IGA":
                adapter.addColegio(new Colegio(R.drawable.iga,"IGA","l IGA abrió sus puertas en 1963 con la carrera de Secretariado Bilingüe (español-inglés), a partir de esa fecha nuestro propósito ha sido ofrecer a la juventud guatemalteca una educación integral, bilingüe (español-inglés) basada en estándares educativos elevados, que enfatizan la calidad académica y los valores universales con el fin de que el graduado pueda  continuar con éxito la educación superior, incorporarse en el campo laboral, afrontar las exigencias de la sociedad y alcanzar sus anhelos personales.\n" +
                        "\n" +
                        "A la fecha IGA ha graduado 53 promociones de jóvenes profesionales.\n" +
                        "\n" +
                        "El primer OpenHose para las admisiones del 2017 se llevará a cabo el martes 20 de junio, a las 17:00 horas en la sede de la IGA School en la zona 4."));
                break;
            case "América Latina":
                adapter.addColegio(new Colegio(R.drawable.america_latina,"América Latina","El Dr. Virgilio Zapata y la Licda. Beatriz Espinoza de Zapata fundaron el Instituto Evangélico América Latina hace más de 50 años con un propósito: que niños y jóvenes tuvieran un lugar especial donde aprender y donde formarse como líderes cristianos. Eso ha sido nuestra fuerza y pasión por más de medio siglo.\n" +
                        "La Visión de tener enseñanza de alta calidad y formación de líderes cristianos de influencia ha hecho toda la diferencia en la educación de más de 50 Promociones de alumnos que hemos graduado.\n" +
                        "Nuestros fundadores aman la educación y la enseñanza, pero sobre todo aman a los niños y a los jóvenes.\n" +
                        "La influencia de ese amor está en todos nuestros programas educativos asegurando que nuestros alumnos no sólo reciban educación pertinente, sino una formación integral que les sirva para toda la vida."));
                break;
            case "Escuela de Comercio":
                adapter.addColegio(new Colegio(R.drawable.comercip,"Escuela de Comercio","Educar al Joven para que el Dia de mañana sea un excelente bachiller"));
                break;
            case "Campo Verde":
                adapter.addColegio(new Colegio(R.drawable.campo_alegrev,"Campo Verde","Visión\n" +
                        "Ser  una institución formadora de  guatemaltecos (as) cuyas características responden a las exigencias de formación integral de los nuevos ciudadanos (as), desarrollando en ellos (as) competencias científicas, culturales, sociales para su inserción positiva a las exigencias que la sociedad plantea.\n" +
                        "\n" +
                        "Misión\n" +
                        "Somos una institución que formamos ciudadanos conscientes de su papel en la sociedad, con altos valores éticos y morales, cuya formación integral y competencias garanticen su desarrollo armónico, con actitud crítica, creativa, propositiva y de sensibilidad social.\n" +
                        "\n" +
                        "Nuestro proyecto educativo\n" +
                        "La Educación es uno de los medios indispensables para lograr el desarrollo de los países. Actualmente, Guatemala está en un proceso de Reforma Educativa, la cual requiere de un serio compromiso, de amor, de vocación, del logro de metas que a corto, mediano o largo plazo, que nos permitan ver cambios positivos en nuestra sociedad. Por tal motivo, desarrollar un proyecto educativo que logre esos ideales ha sido la pieza angular de los mismos. Queremos ser para Guatemala una oportunidad para tantos niños y adolescentes que necesitan de una buena educación, que les permita crecer en sus conocimientos, habilidades, incorporación de la tecnología,  y en el fortalecimiento permanente de sus principios y valores, para que en un próximo futuro, sean ellos quienes promuevan cambios positivos y permanentes. Con ese ideal, desde hace más de diez años, estamos trabajando arduamente, para continuar ofreciendo a niños y jóvenes, una oportunidad educativa de calidad, la cual será la base sólida para construir su propio destino y el de nuestro país.\n"+"¿Quiénes somos?\n" +
                        "Somos una comunidad educativa que acompaña a cada alumno a descubrir y potenciar sus  habilidades para desarrollarse como un ciudadano global, pleno y exitoso. \n" +
                        "Somos una institución educativa que forma individuos para que puedan desenvolverse como ciudadanos responsables, capaces de alcanzar sus metas personales y participar en la construcción de un mejor país.\n" +
                        "Somos una propuesta innovadora donde el estudiante puede pensar, crear, experimentar, buscar su propia manera de aprender, donde muchas veces haciendo, aprende lo que le gusta.\n" +
                        "Somos parte de los cambios tecnológicos que día a día avanzan con mayor rapidez, y que nos empujan a rediseñar nuestro sistema de enseñanza-aprendizaje,   acorde a los requerimientos de una sociedad digital y la educación del Siglo XXI."));
                break;
            case "Monte Carmelo":
                adapter.addColegio(new Colegio(R.drawable.monte_carmelo,"Monte Carmelo","Dirección: 2a. Calle 32-41, Zona 7 Ciudad: Guatemala Tel: 2434-6629 y 2439-3220 Email: monte_carmelo06@yahoo.com"));
                break;
            case "Liceo Javier":
                adapter.addColegio(new Colegio(R.drawable.liceo_javier,"Liceo Javier","El Liceo Javier es una institución educativa fundada en 1952, ubicada en la ciudad de Guatemala, dirigida por la Compañía de Jesús. Se imparten clases desde Maternal (3 años) hasta V Bachillerato en Ciencias y Letras. Desde sus inicios era un establecimiento escolar para varones, sin embargo, a partir del año 2000 inició a ser un colegio coeducativo ( Hombres y Mujeres) . La historia del Liceo Javier ha caminado al lado y en sintonía con la historia nacional y religiosa de Guatemala. Se distinguen, en este sentido, cinco períodos claramente diferenciados: Orígenes Consolidación Prueba Renovación Respondiendo con originalidad y eficacia a las nuevas demandas del nuevo siglo"));
                break;
            case "Federico Taylor":
                adapter.addColegio(new Colegio(R.drawable.federico,"Federico Taylor","Misión\n" +
                        "Somos una institución educativa seria, altamente organizada y con 31 años de experiencia en impartir educación, instrucción técnica industrial y capacitación empresarial.  Formamos hombres y mujeres responsables y emprendedoras. Educamos con principios: científicos, tecnológicos, humanísticos, éticos, cívicos, familiares y cristianos. Nuestros educandos (as) son personas con deseo de superación, interesadas en el desarrollar su liderazgo personal positivo Utilizamos la ciencia y la mejor tecnología a nuestro alcance para que logren ser Alguien en la Vida.\n"+"Visión\n" +
                        "Despúes de 31 años de servir a Nuestro Sistema Educativo Nacional de Guatemala (1,984-2,014) seguiremos trabajando arduamente para seguir siendo una Institución Educativa fuerte, sólida, firme y de calidad. Respaldándonos por nuestros valores y principios que nos permitan mantener un posicionamiento a nivel nacional e internacional. Así como también mantenernos a la vanguardia de la Educación Tecnológica en Guatemala. Perfilándonos como una Institución Educativa de prestigio y líder en la Formación Académica, Institución Técnica Industrial y Capacitación Empresarial. Vemos el futuro de una forma positiva, alentadora y realista. Deseamos seguir creciendo y desarrollándonos para sentar las bases y fundar una Universidad Tecnológica en Guatemala."));
                break;
            case "Fishman":
                adapter.addColegio(new Colegio(R.drawable.fishman,"Fishman","Instituto Público guatemalteco, pionero en la formación de técnicos para la industria. Con más de cinco décadas impartir enseñanza."));
                break;
            case "Canadiense":
                adapter.addColegio(new Colegio(R.drawable.canadiense,"Canadiense","Liceo Canadiense se dedica a promover la innovación, la creatividad y el pensamiento crítico independiente. A lo largo de su vida escolar, los alumnos son animados a explorar y aprender más allá de los límites de las aulas de clase, haciendo conexiones prácticas e interactuando con el mundo que los rodea. Todos los estudiantes son tratados como individuos, brindándoles absoluto respeto en todo momento."));
                break;
            case "Emiliani":
                adapter.addColegio(new Colegio(R.drawable.emiliani,"Emiliani","Institución Técnica Privada.\n" +
                        "Contamos con las carreras:\n" +
                        "Bachiller Industrial y perito en una especialidad\n" +
                        "Mecánica Automotriz\n" +
                        "Electrónica\n" +
                        "Electricidad\n" +
                        "Dibujo de Construcción"));
                break;
            case "SEK":
                adapter.addColegio(new Colegio(R.drawable.sek,"SEK","En el año 1892, Don José de Olavarrieta y López funda en Madrid el primer colegio de la Institución, 10 años más tarde solicita el reconocimiento oficial del mismo a la Universidad Central de esta ciudad.\n" +
                        "\n" +
                        "Al profesor Olavarrieta sucede en la dirección el religioso, Don Andrés Chiclana que rige los destinos del centro, situado en la calle Atocha, hasta 1935. Ese año, Don Felipe Segovia Martínez adquiere el colegio, que se conocía entonces con el nombre San Estanislao, tenía cincuenta alumnos y doce profesores.\n" +
                        "\n" +
                        "El colegio sobrevive a la Guerra Civil Española, pero cambia de nombre durante los años que dura la contienda por estar situado en el Madrid republicano pasando a llamarse Numancia, y al término de la misma recupera su nombre original.\n" +
                        "\n" +
                        "Al concluir el enfrentamiento en 1939, el profesor Segovia Martínez junto a su esposa Doña Carmen Olmo, dan un impulso fundamental al crecimiento del colegio abriendo nuevas aulas en otros lugares del centro de Madrid y creando un nuevo centro en la calle Arturo Soria. De esta forma, la matrícula pasa a superar los mil quinientos alumnos en los años cincuenta, con más de ochenta profesores.\n" +
                        "\n" +
                        "En 1960, se hace cargo de la dirección un joven equipo docente liderado por D. Felipe Segovia Olmo, que aporta nuevas ideas al desarrollo de los colegios que pasan a denominarse San Estanislao de Kostka. Por su iniciativa se amplía el centro de Arturo Soria y se crean dos nuevos centros en las afueras de la capital española.\n" +
                        "\n" +
                        "En 1982 asume la dirección el Dr. Jorge Segovia Bonet, actual Presidente de la Institución, quien plantea el desafío de dar una verdadera proyección internacional a la organización educativa. Desde este momento, la que va a convertirse en una de las instituciones educativas más importantes del mundo, pasa a conocerse exclusivamente por las siglas SEK.\n" +
                        "\n" +
                        "Así se pone en marcha un sueño largamente esperado por nuestra comunidad educativa, el establecimiento de nuevos colegios en otros países del mundo. En 1982 se inaugura el \"Colegio Internacional SEK-Chile\" en la ciudad de Santiago, en Octubre de 1984 comienzan las clases en el \"Colegio Internacional SEK-Ecuador\" de la ciudad de Quito que recibe el honor de ser considerado centro experimental por parte de las autoridades educativas, en 1986 abren sus puertas el \"Colegio Internacional SEK-Panamá\" y el \"Colegio Internacional SEK –Ecuador” de la ciudad de Guayaquil, en 1988 comienza su andadura el \"Colegio Internacional SEK-Paraguay\" en Asunción, a la vez que el \"Colegio Internacional SEK-Costa Rica\" en la ciudad de San José.\n" +
                        "\n" +
                        "En 1989 se constituye la Institución Internacional SEK como organización independiente de dirección y gestión de todos los centro situados en América, haciendo más eficaz y dinámico su constante crecimiento.\n" +
                        "\n" +
                        "De esta manera, el trabajo de creación de nuevos centros no se detiene, y en 1992 la Institución retoma el impulso en Europa y adquiere el \"Colegio Internacional Eirís\" en La Coruña y en 1994 también se incorpora el \"Colegio Internacional de Levante\" en Valencia, España; en 1995 abre sus puertas el \"Colegio Internacional SEK-Pacífico\" en Viña del Mar, Chile; en 1996 se pone en funcionamiento el \"Colegio Internacional SEK-Las Américas\" en Santo Domingo, República Dominicana; en Septiembre de 1997 comienzan las clases en el \"Colegio Internacional SEK-Budapest\" en Hungría; en 1999 \"SEK Boca Raton Preparatory School\" en Estados Unidos y en el año 2000 el \"Colegio Internacional SEK Guatemala\" en Ciudad de Guatemala, pasan a formar parte de la gran familia SEK.\n" +
                        "\n" +
                        "Este importante crecimiento a nivel global, lleva consigo una mejora en todos los procesos educativos de los distintos centros, puesto que se produce una sinergia permanente que hace que el enriquecimiento entre todos ellos sea una constante en su trabajo; compartir experiencias, participar en programas internacionales de todo tipo culturales, deportivos o científicos, crear nuestra propia tecnología de apoyo al aprendizaje, permiten ofrecer la más alta calidad educativa para todos los alumnos.\n" +
                        "\n" +
                        "En septiembre de 2004 se incorpora “Grantham Preparatory International School” en el Reino Unido, y en el año 2005 es un nuevo continente quién se une a la Institución, África. Y es en Ciudad del Cabo donde inicia sus labores “ Hout Bay International School”, pero también lo hacen ese mismo año, los Colegios Internacionales “SEK Los Valles” en la ciudad de Quito, Ecuador y “SEK Guadalajara”.\n" +
                        "\n" +
                        "En el año 2006 y con el fin de atender con mayor eficacia a los nuevos centros situados fuera de España e Iberoamérica, se creará IES (International Education Systems), y ese mismo año sigue la expansión en Sudáfrica y se incorpora a la Institución un nuevo centro “Helderberg International School“.\n" +
                        "\n" +
                        "En el año 2007, se incorpora a nuestra institución otro colegio centenario de rica historia “St John’s International School” situado en Sidmouth, Reino Unido, que entre sus excelentes instalaciones cuenta con una residencia propia para acoger a estudiantes de todas partes del mundo.\n" +
                        "\n" +
                        "En 2008 abre sus puertas “Blouberg International School”, también situado en Ciudad del Cabo, y a la vez la Institución adquiere el laureado equipo de fútbol profesional Unión Española de Chile, reafirmando su compromiso con el deporte.\n" +
                        "\n" +
                        "En 2016 inicia su andadura, esta vez en Eslovenia, el “International Bilingual School Ljubljana”, y en 2017 a la familia IES se une el “Udine International School” en Italia.\n" +
                        "\n" +
                        "Finalmente, en marzo de 2018, abre sus puertas el segundo centro en Santiago de Chile, el “Colegio Internacional SEK-Austral” continuando con el excelente trabajo desarrollado por el “Colegio Internacional SEK-Chile” por más de tres décadas, así como el “Colegio Internacional SEK-Colombia” en la ciudad de Bogotá\n" +
                        "\n" +
                        "Pero la Institución Internacional SEK, no solamente crece geográficamente y en número de alumnos y centros, sino también lo hace en desarrollo y grados académicos. Creando sus propios centros de estudios superiores, así en 1989 nace la Universidad Internacional SEK en Santiago de Chile, que comienza sus clases en Marzo de 1990, y en 1993 el Honorable Congreso Nacional de Ecuador, vota favorablemente la Ley de Creación de la Universidad Internacional SEK en dicho país. En 2017 la Comunidad de Madrid aprueba la creación del Centro Universitario de Negocios, Innovación y Tecnología, un nuevo centro de estudios superiores en dicha ciudad para nuestra Institución.\n" +
                        "\n" +
                        "Las Universidades son los centros superiores que coronan todo el proceso educativo y de desarrollo institucional de los últimos años, abriendo a la vez las más diversas posibilidades al progreso de SEK en las décadas venideras.\n" +
                        "\n" +
                        "Hoy SEK es pionera en aplicar en sus aulas las últimas tecnologías para la educación; las pizarras digitales, los libros interactivos, las videoconferencias, la red wifi de alta velocidad en todos los centros, el empleo de iPad en sus clases, y el uso de la inteligencia artificial.\n" +
                        "\n" +
                        "Nuestro principal objetivo es entregar a alumnos, padres y profesores una institución educativa moderna, de primera línea internacional, que ofrezca el más alto grado de excelencia humana y académica en la formación de los hombres y mujeres del mañana.\n" +
                        "\n" +
                        "En estos más de 125 años de historia, los miembros de la Institución Internacional SEK se enorgullecen de haber consagrado sus vidas a un gran proyecto que traspasa fronteras, que no discrimina, y que desde su absoluta independencia de grupos políticos o religiosos, solo se debe a sus alumnos y sus familias, que confían en nosotros su formación.\n" +
                        "\n" +
                        "Y todo esto con una sola meta: ser cada día mejores."));
                break;
            case "EAS":
                adapter.addColegio(new Colegio(R.drawable.eas,"EAS","Somos guatemaltecos comprometidos con nuestro país, contribuimos en la construcción de una nueva sociedad, en donde todos los guatemaltecos valoran y respetan la dignidad de la persona contribuyendo solidariamente a su desarrollo.\n" +
                        "Una sociedad en donde todos tengan la oportunidad de un trabajo digno, gozar de los beneficios de vivir en comunidad y encontrar las condiciones para su plena realización como seres humanos.\n" +
                        "Estamos convencidos que uno de los factores determinantes para lograrlo es la EDUCACIÓN, transmitiendo valores morales, culturales y familiares, desarrollando una cultura de paz que busca el crecimiento personal y el bien común. Formando ciudadanos y profesionales que el país necesita de acuerdo a los avances académicos, tecnológicos, humanísticos, científicos y de los desafíos que siglo XXI presenta."));
                break;
            case "La Colina":
                adapter.addColegio(new Colegio(R.drawable.la_colina,"La Colina","Visión\n" +
                        "\n" +
                        "Seremos una organización que proveerá educación integral de calidad a través de métodos educativos innovadores buscando llenar las expectativas de nuestros estudiantes, utilizaremos tecnología de vanguardia, impartiremos formación bilingüe basada en valores cristianos, morales y cívicos en una ambiente seguro, agradable y amable; todo esto con el fin de desarrollar en nuestros estudiantes competencias que les permitan destacar dentro de cualquier casa de estudios universitarios.\n" +
                        "\n" +
                        "Nos esforzaremos por que cada miembro de nuestro equipo de trabajo este calificado para cumplir con nuestras metas e ir en búsqueda de la mejora continua y así poder brindar a nuestros estudiantes y padres de familia la oportunidad de vivir junto a nosotros una experiencia única e inolvidable.\n" +
                        "\n" +
                        "Misión\n" +
                        "\n" +
                        "Somos una organización guatemalteca deseosa de brindar educación integral para formar futuros profesionales destacados en todas las áreas, con el fin de servir a nuestro país con toda su capacidad intelectual, humana y moral. Creemos que la utilización de los avances pedagógicos y tecnológicos es fundamental para lograr un alto rendimiento educativo.                                        \n" +
                        "\n" +
                        "Valores\n" +
                        "\n" +
                        "Nuestros valores se basan en excelencia académica, formación bilingüe, innovación, formación cristiana, moral y cívica. Nuestros valores son los pilares sobre los cuales se fundamenta nuestro proceso educativo. Queremos ser y ser reconocidos como una institución que se caracteriza por su “CALIDEZ, EXIGENCIA Y RESPETO”."));
                break;
            case "Las Charcas":
                adapter.addColegio(new Colegio(R.drawable.las_charcas,"Las Charcas","Hace más de cuarenta años, unos padres de familia conscientes de su derecho y deber irrenunciable sobre la formación de los hijos, se empeñaron en promover unos colegios donde recibieran una educación que fuese una continuación de la que procuraban en su familia."));
                break;

        }

    }

    @Override
    public void click(Colegio colegio) {
        switch (colegio.getNombre()){
            case "Santa Teresita":
                String uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.603396, -90.556671,14.603396, -90.556671,"Santa Teresita");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "Belga Guatemalteco":

                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.639781, -90.509331, 14.639781, -90.509331, "Belga Guatemalteco");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "Fundacion Junkabal":
                 uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.620870, -90.529801,14.620870, -90.529801,"Fundacion Junkabal");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "Bethania":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.582485, -90.488848,14.582485, -90.488848,"Bethania");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "Casa Central":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.636203, -90.520012,14.636203, -90.520012,"Casa Central");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "El Rosario":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.633441, -90.518316,14.633441, -90.518316,"El Rosario");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "Maria Auxiliadora":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.608858, -90.521215,14.608858, -90.521215,"Maria Axiliadora");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "La Asuncion":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.601795, -90.507790,14.601795, -90.507790,"La Asuncion");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "Monte Maria":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.583818, -90.563544,14.583818, -90.563544,"Monte Maria");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "Campo Alegre":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.594363, -90.569588,14.594363, -90.569588,"Campo Alegre");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "Santa Inés":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.594363, -90.569588,14.594363, -90.569588,"Santa Inés");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "Don Bosco":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.623622, -90.520750,14.623622, -90.520750,"Don Bosco");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "San Sebastian":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.646512, -90.512397,14.646512, -90.512397,"San Sebastian");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "San Jose de los Infantes":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.642604, -90.586255,14.642604, -90.586255,"San Jose de los Infantes");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "San Pablo":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.636490, -90.519002,14.636490, -90.519002,"San Pablo");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "Fundación Kinal":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.625494, -90.536005,14.625494, -90.536005,"Fundación Kinal");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "El Roble":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.577050, -90.577349,14.577050, -90.577349,"El Roble");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "AmeriTec":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.587913, -90.571525,14.587913, -90.571525,"AmeriTec");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "Rafael Landivar":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.641783, -90.517666,14.641783, -90.517666,"Rafel Landivar");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "Liceo Guatemala":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.638877, -90.518707,14.638877, -90.518707,"Liceo Guatemala");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "IMB-PC":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.590270, -90.545301,14.590270, -90.545301,"IMB-PC");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "IGA":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.622316, -90.513655,14.622316, -90.513655,"IGA");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "América Latina":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 15.305544, -91.496681,15.305544, -91.496681,"América Latina");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "Escuela de Comercio":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 15.305544, -91.496681,15.305544, -91.496681,"Escuela de Comercio");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "Campo Verde":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.525928, -90.562131,14.525928, -90.562131,"Campo Verde");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "Monte Carmelo":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.630625, -90.560198,14.630625, -90.560198,"Monte Carmelo");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "Liceo Javier":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.584949, -90.561529,14.584949, -90.561529,"Liceo Javier");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "Federico Taylor":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.651277, -90.510610,14.651277, -90.510610,"Federico Taylor");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "Fishman":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.598249, -90.531105,14.598249, -90.531105,"Fishman");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "Canadiense":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.594523, -90.557039,14.594523, -90.557039,"Liceo Canadiense");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "Emiliani":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.646623, -90.582092,14.646623, -90.582092,"Emiliani");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "SEK":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.515472, -90.437442,14.515472, -90.437442,"SEK");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "La Colina":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.610117, -90.659897,14.610117, -90.659897,"La Colina");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;
            case "Las Charcas":
                uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", 14.594563, -90.569630,14.594563, -90.569630,"Las Charcas");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
                break;

        }


    }
}
