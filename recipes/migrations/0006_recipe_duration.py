# Generated by Django 5.0.4 on 2024-04-11 12:18

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('recipes', '0005_alter_recipe_id'),
    ]

    operations = [
        migrations.AddField(
            model_name='recipe',
            name='duration',
            field=models.PositiveIntegerField(default=1, max_length=20),
            preserve_default=False,
        ),
    ]
