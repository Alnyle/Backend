# Generated by Django 5.0.4 on 2024-04-09 14:50

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('recipes', '0003_level_publisher_alter_ingredient_name_and_more'),
    ]

    operations = [
        migrations.RenameField(
            model_name='recipe',
            old_name='recipes',
            new_name='Level',
        ),
    ]
