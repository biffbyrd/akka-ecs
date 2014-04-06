package game.entity

import game.components.Component
import game.components.ComponentType
import game.components.io.InputComponent
import game.components.io.ObserverComponent
import akka.actor.ActorRef

class PlayerEntity( inputComponent: ActorRef, clientComponent: ActorRef ) extends Entity {
  override val id: EntityId = EntityId( inputComponent.path.toString )

  override val components: Map[ ComponentType, ActorRef ] = Map(
    ComponentType.Input -> inputComponent,
    ComponentType.Client -> clientComponent
  )
}