package com.example.natureapp.models

data class NatureItem (
    val titulo: String,
    val descripcion: String,
    val imagen: String
){
    companion object{
        val natureItems = mutableListOf(
            NatureItem("El Gran Cañón","El Gran Cañón de Estados Unidos se ubica en el estado de Arizona y se extiende en un total de 493 mil hectáreas. Según la organización de Naciones Unidas, su inmensidad es asombrosa y se formó durante 6 millones de años de actividad geológica y erosión por el río Colorado en la corteza terrestre levantada.", "https://static.nationalgeographicla.com/files/styles/image_3200/public/nationalgeographic2643171.webp?w=789&h=527"),
            NatureItem("El Amazon","El área protegida más grande del Amazonas sudamericano se encuentra en Brasil y es una de las regiones más ricas del planeta en términos de biodiversidad. Abarca un total de 5 millones de hectáreas de bosque amazónico. ", "https://static.nationalgeographicla.com/files/styles/image_3200/public/nationalgeographic2777124.webp?w=789&h=526"),
            NatureItem("Antártida","Pocos paisajes en el mundo son tan originales y únicos como el que presenta la Antártida, con prácticamente todo su terreno cubierto de nieve, increíbles glaciares azules, cuerpos de hielo que sorprenden con sus formas y reflejos de la luz y hasta volcanes activos.", "https://www.cronista.com/files/image/464/464747/62a0d5ccd0b2b_934_616!.webp?s=84ec154d106a0f1ccb34603c77934de9&d=1654707666&oe=jpg"),
            NatureItem("Reynisfjara","Reynisfjara es una playa de arena negra de fama mundial por su belleza y peligrosidad, situada en la Costa Sur de Islandia, justo al lado del pequeño pueblo de pescadores de Vik i Myrdal.", "https://www.cronista.com/files/image/464/464733/62a0d008afebf_934_616!.webp?s=1dbc8de2177e654ed0a97642ec5a0b25&d=1654706194&oe=jpg"),
            NatureItem("Islas Galápagos","Las islas Galápagos son un archipiélago volcánico del océano Pacífico. Es conocido como uno de los destinos más famosos del mundo para la observación de fauna. Es una provincia de Ecuador y se encuentra a unos 1,000 km desde sus costas. Su terreno aislado alberga una diversidad de especies animales y vegetales, muchas de ellas exclusivas.", "https://www.cronista.com/files/image/464/464741/62a0d322a742c_934_616!.webp?s=02062551882de246c8a080f4cb5f8251&d=1654706987&oe=jpg"),
        )
    }
}