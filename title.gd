extends Control

func _ready():
  pass

func _on_StartButton_pressed():
	print("Starting game")
	get_tree().change_scene("Game.tscn")