# Generated by Django 5.0.4 on 2024-04-11 15:26

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('recipes', '0009_alter_recipe_publisher'),
    ]

    operations = [
        migrations.AddField(
            model_name='recipe',
            name='steps',
            field=models.TextField(default=1),
            preserve_default=False,
        ),
    ]