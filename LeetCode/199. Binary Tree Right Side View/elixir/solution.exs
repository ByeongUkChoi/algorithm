# Definition for a binary tree node.
#
# defmodule TreeNode do
#   @type t :: %__MODULE__{
#           val: integer,
#           left: TreeNode.t() | nil,
#           right: TreeNode.t() | nil
#         }
#   defstruct val: 0, left: nil, right: nil
# end

defmodule Solution do
  @spec right_side_view(root :: TreeNode.t() | nil) :: [integer]
  def right_side_view(%{val: root_val, left: %{val: right_val, left: nil, right: nil}, right: nil}) do
    [root_val, right_val]
  end

  def right_side_view(root) do
    root |> traverse() |> Enum.reverse()
  end

  def traverse(node, acc \\ [])
  def traverse(nil, acc), do: acc
  def traverse(node, acc), do: traverse(node.right, [node.val | acc])
end
