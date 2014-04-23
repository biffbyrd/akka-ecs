package game.entities

import akka.actor.ActorRef
import engine.component.ComponentType
import engine.entity.{EntityId, Entity}

class StructureEntity( physicalComponent: ActorRef ) extends Entity {
  override val id = EntityId( physicalComponent.path.toString )

  override val components: Map[ ComponentType, ActorRef ] = Map(
    ComponentType.Dimension -> physicalComponent
  )
}