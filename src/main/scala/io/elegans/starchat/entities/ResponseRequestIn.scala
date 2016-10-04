package io.elegans.starchat.entities

/**
  * Created by Angelo Leto <angelo.leto@elegans.io> on 27/06/16.
  */

import scala.collection.immutable.Map

case class ResponseRequestInUserInput(text: Option[String], img: Option[String])

case class ResponseRequestInValues(return_value: Option[String], data: Option[Map[String, String]])

case class ResponseRequestIn(user_id: String, user_input: Option[ResponseRequestInUserInput],
                                values: Option[ResponseRequestInValues])
